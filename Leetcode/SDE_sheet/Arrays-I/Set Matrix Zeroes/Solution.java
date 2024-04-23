import static java.util.Collections.fill;

class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> og_zeroes = new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
               if(matrix[i][j]==0) {
                    og_zeroes.add(new ArrayList<>(Arrays.asList(i,j)));
               }
            }  
        }
        for(int i=0;i<og_zeroes.size();i++){
            // Filling Row with zeroes
            Arrays.fill(matrix[og_zeroes.get(i).get(0)], 0);
            for(int j=0;j<matrix.length;j++) {
                matrix[j][og_zeroes.get(i).get(1)] = 0;
            }
        }
    }
}
