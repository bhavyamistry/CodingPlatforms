class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> op = new ArrayList<>();
        Comparator<int[]> comparator = new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(a[0], b[0]);
            }
        };

        // Create priority queue with custom comparator
        PriorityQueue<int[]> pq = new PriorityQueue<>(comparator);

        // Add elements from 2D array to priority queue
        for (int[] row : intervals) {
            pq.offer(row);
        }
        int start =0;
        while(!pq.isEmpty()){
            intervals[start] = pq.poll();
            start++;
        }
        start = 1;
        op.add(intervals[0]);
        while(start!=intervals.length){
            int last_item[] = op.get(op.size()-1);
            if(intervals[start][0] >= last_item[0] && intervals[start][0] <= last_item[1]){
                if(intervals[start][1] >= last_item[1]){
                    last_item[1] = intervals[start][1];
                    op.set(op.size()-1, last_item);
                }
            }
            else{
                op.add(intervals[start]);
            }
            start++;
            // for(int i=0;i<op.size();i++){
            //     System.out.println(Arrays.toString(op.get(i)));
            // }
        }
        int[][] result = new int[op.size()][];
        for (int i = 0; i < op.size(); i++) {
            result[i] = op.get(i);
        }
        return result;
    }
}
