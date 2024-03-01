class Solution {
    public int maxArea(int[] height) {
        int left = 0, right = (height.length-1);
        int max_area = 0;
        while(left!=right){
            if(height[left]<height[right]){
                if(height[left]*(right-left) > max_area){
                    max_area = height[left]*(right-left);
                }
                left++;
            }
            else{
                if(height[right]*(right-left) > max_area){
                    max_area = height[right]*(right-left);
                }
                right--;
            }
        }
        return max_area;
    }
}
