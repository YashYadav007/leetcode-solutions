class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean firstRowZero = false, firstColZero = false;

        // Check if first row or first column has any zeros
        for (int i = 0; i < m; i++)
            if (matrix[i][0] == 0) firstColZero = true;

        for (int j = 0; j < n; j++)
            if (matrix[0][j] == 0) firstRowZero = true;

        // Mark zeros in first row and column
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Zero out cells based on marks
        for (int i = 1; i < m; i++) {
            if (matrix[i][0] == 0) {
                Arrays.fill(matrix[i], 0);
            }
        }

        for (int j = 1; j < n; j++) {
            if (matrix[0][j] == 0) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Handle first row and column separately
        if (firstRowZero) Arrays.fill(matrix[0], 0);
        if (firstColZero) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }
    }
}
