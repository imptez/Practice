package bosscoder.maths;

public class UniquePathsII {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int[][] obstacleGrid2 = {{0,1},{0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid2));
    }

    static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            arr[i][n - 1] = 1;
        }
        for (int j = 0; j < n; j++) {
            arr[m - 1][j] = 1;
        }

        for (int x = m - 2; x >= 0; x--) {
            for (int y = n - 2; y >= 0; y--) {
                if (obstacleGrid[x + 1][y] == 1 || obstacleGrid[x][y + 1] == 1) {
                    arr[x][y] = 1;
                } else {
                    arr[x][y] = arr[x + 1][y] + arr[x][y + 1];
                }
            }
        }

        return arr[0][0];
    }

}
