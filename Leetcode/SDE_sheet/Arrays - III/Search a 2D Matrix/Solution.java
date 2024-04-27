class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = -1;
        for(int i=0;i<matrix.length;i++){
            if(target >= matrix[i][0] && target <= matrix[i][matrix[i].length-1]){
                row = i;
                break;
            }
        }
        if(row == -1){
            return false;
        }
        else{
            int low = 0, high = matrix[0].length-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(matrix[row][mid] == target){
                    return true;
                }
                if(target > matrix[row][mid]){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return false;
        }
    }
}
