class Solution {
    public int maxSubArray(int[] nums) {
        int b = nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        if(nums.length>1){
            for(int i=1;i<nums.length;i++){
            if(nums[i]>(dp[i-1]+nums[i])){
                dp[i] = nums[i];
            }
            else{
                dp[i] = nums[i]+dp[i-1];
            }
            if(dp[i]>b){
                b = dp[i];
            }
            }
        }
        return b;
    }
}
