public class LinearFillMatrix {
    public static void main(String[] args) {
        int n = 4, m = 6; // Матрицаның өлшемдері

        int[][] matrix = new int[n][m];
        int value = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = value++;
            }
        }

        printMatrix(matrix);
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.printf("%4d", num);
            }
            System.out.println();
        }
    }
}