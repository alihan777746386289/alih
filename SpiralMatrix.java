public class SpiralMatrix {
    public static void main(String[] args) {
        int n = 5;
        int[][] matrix = new int[n][n];

        int value = 1;
        int left = 0, right = n - 1, top = 0, bottom = n - 1;

        while (value <= n * n) {
            for (int i = left; i <= right; i++) matrix[top][i] = value++;
            top++;
            for (int i = top; i <= bottom; i++) matrix[i][right] = value++;
            right--;
            for (int i = right; i >= left; i--) matrix[bottom][i] = value++;
            bottom--;
            for (int i = bottom; i >= top; i--) matrix[i][left] = value++;
            left++;
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