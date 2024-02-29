class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum[] = new int[nums.length];
        int product = 1;
        // determine any zeroes
        int anyzero = 0;
        int loc = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                anyzero++;
                loc = i;
            }
            else{
                product *= nums[i]; 
            }
        }
        if(anyzero == 1){
            sum[loc] = product;
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(nums[i] != 0 && anyzero ==0){                
                    sum[i] = product / nums[i];
                }
                System.out.println(sum[i]);
            }
        }
        return sum;
    }
}
