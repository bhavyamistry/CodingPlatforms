class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        ArrayList<Integer> num1 = new ArrayList<>();
        int nums2_counter = 0;
        for(int i=0;i<(nums1.length-n);i++){
            num1.add(nums1[i]);
        }
        int final_size = num1.size()+nums2.length;
        for(int i=0;i<final_size;i++){        
            if(nums2_counter>=nums2.length)
            {   
                nums1[i] = num1.remove(0);
            }
            else if(num1.size() > 0 && num1.get(0) <= nums2[nums2_counter]){
                nums1[i] = num1.remove(0);
            }
            else{
                nums1[i] = nums2[nums2_counter];
                nums2_counter++;
            }
        }
    }
}
