class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        // Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(!dict.containsKey(nums[i])){
                dict.put(nums[i], 0);
            }
            else{
                return nums[i];
            }
        }
        return 0;
    }
}
