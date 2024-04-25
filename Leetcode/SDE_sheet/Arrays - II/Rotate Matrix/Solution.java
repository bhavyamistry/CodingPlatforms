class Solution {
    public void print(int[][] matrix){
        for (int[] row : matrix) {
            StringBuilder rowString = new StringBuilder();
            for (int num : row) {
                rowString.append(num).append(" ");
            }
            System.out.println(rowString.toString().trim());
        }
    }
    public int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move to the next pair of elements
            start++;
            end--;
        }
        return arr;
    }
    public void rotate(int[][] matrix) {
        // 1st row is reversed 1st column
        // 2nd row is reversed 2nd column
        // 3rd row is reversed 3rd column
        int row[] = new int[matrix[0].length];
        int col[] = new int[matrix[0].length];
        int cnt = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[0].length; j++) {
                // Swap matrix[i][j] and matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = reverseArray(matrix[i]);
        }
    }
}
