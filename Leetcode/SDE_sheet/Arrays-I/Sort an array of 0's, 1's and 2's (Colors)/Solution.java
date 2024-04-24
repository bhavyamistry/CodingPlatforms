class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map_nums = new HashMap<Integer, Integer>();
        map_nums.put(0, 0);
        map_nums.put(1, 0);
        map_nums.put(2, 0);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                map_nums.put(0, map_nums.get(0)+1);
            }
            else if(nums[i]==1){
                map_nums.put(1, map_nums.get(1)+1);
            }
            else if(nums[i]==2){
                map_nums.put(2, map_nums.get(2)+1);
            }
        }
        for(int i=0;i<nums.length;i++) {
            if(map_nums.get(0)>0){
                nums[i] = 0;
                map_nums.put(0, map_nums.get(0)-1);
            }
            else if(map_nums.get(1)>0){
                nums[i] = 1;
                map_nums.put(1, map_nums.get(1)-1);
            }
            else if(map_nums.get(2)>0){
                nums[i] = 2;
                map_nums.put(2, map_nums.get(2)-1);
            }
        }
    }
}
