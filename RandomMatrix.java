import java.util.Random;

public class RandomMatrix {
    public static void main(String[] args) {
        int n = 5; // Матрицаның жол саны
        int m = 7; // Матрицаның баған саны

        int[][] matrix = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = random.nextInt(100);
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