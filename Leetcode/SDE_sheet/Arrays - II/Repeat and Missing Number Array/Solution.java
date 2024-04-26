public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        int op[] = new int[2];
        int min = 1;
        for(int i=0;i< A.length;i++){
            // if(A[i] < min){
            //     min = A[i];
            // }
            if(!dict.containsKey(A[i])){
                dict.put(A[i],0);
            }
            else{
                dict.put(A[i],dict.get(A[i])+1);
            }
        }
        for(Integer key : dict.keySet()){
            if(dict.get(key) > 0){
                op[0] = key;
            }
        }
        // System.out.println(dict);
        while(dict.containsKey(min)){
            min++;
        }
        op[1] = min;
        return op;
    }
}
