import java.io.*;

public class MaxInRows {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] size = br.readLine().split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);
        int[][] matrix = new int[n][m];

        for (int i = 0; i < n; i++) {
            String[] row = br.readLine().split(" ");
            int max = Integer.parseInt(row[0]);
            for (int j = 0; j < m; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
                max = Math.max(max, matrix[i][j]);
            }
            System.out.print(max + " ");
        }
    }
}