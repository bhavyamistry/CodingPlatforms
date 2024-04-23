class Solution {
    public void nextPermutation(int[] nums) {
        int flag = -1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i-1] < nums[i]){
                flag = i-1;
                break;
            }
        }
        if(flag !=-1){
            for(int i=nums.length-1;i>=flag;i--){
                if(nums[i] > nums[flag]){
                    int temp = nums[i];
                    nums[i] = nums[flag];
                    nums[flag] = temp;
                    break;
                }
            }
            Arrays.sort(nums, flag+1, nums.length);
        }
        else{
            Arrays.sort(nums);
        }
    }
}
