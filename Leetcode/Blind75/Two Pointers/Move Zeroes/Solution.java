class Solution {
    public void moveZeroes(int[] nums) {
        int ptr_A = 0, ptr_B = 0;
        boolean anyzero = false;
        // first find the first location of first zero
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                ptr_A = i;
                ptr_B = i;
                anyzero = true;
                break;
            }
        }
        if(anyzero){
            while(ptr_B<nums.length){
                if(nums[ptr_B]!=0){
                    nums[ptr_A] = nums[ptr_B];
                    nums[ptr_B] = 0;
                    ptr_A ++;
                    while(nums[ptr_A]!=0 && ptr_A < nums.length){
                        ptr_A++;
                    }
                    if(ptr_B < ptr_A){
                        ptr_B = ptr_A;
                    }
                }
                else{
                    ptr_B ++;
                }
            }
        }
    }
}
