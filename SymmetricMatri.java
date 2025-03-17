public class SymmetricMatri {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                matrix[i][j] = i + j;
                matrix[j][i] = i + j;
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}