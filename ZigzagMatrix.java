public class ZigzagMatrix {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) matrix[i][j] = i * n + j + 1;
            } else {
                for (int j = 0; j < n; j++) matrix[i][n - j - 1] = i * n + j + 1;
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%2d ", num);
            }
            System.out.println();
        }
    }
}