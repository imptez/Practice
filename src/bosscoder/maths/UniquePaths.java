package bosscoder.maths;

public class UniquePaths {
    public static void main(String[] args) {
        int m = 3, n = 7;
        System.out.println(uniquePaths(m, n));
    }

    static int uniquePaths(int m, int n) {//3,7
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            arr[i][n - 1] = 1;
        }
        for (int j = 0; j < n; j++) {
            arr[m - 1][j] = 1;
        }

        for (int x = m - 2; x >= 0; x--) {//
            for (int y = n - 2; y >= 0; y--) {
                arr[x][y] = arr[x + 1][y] + arr[x][y + 1];
            }
        }
        return arr[0][0];
    }
}
