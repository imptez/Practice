package leetcode;

import java.util.stream.Stream;

public class FloodFillAlgorithm {

  public static void main(String[] args) {

    int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
    int[][] ans =floodFill(image, 1, 1, 2);
    for(int r =0 ;r<ans.length;r++){
     for(int c=0;c<ans[r].length;c++){
       System.out.println(ans[r][c]);
     }
    }
  }

  public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

    int initialColor = image[sr][sc];
    int[][] ans = image;
    int deltaRow[] = {-1, 0, 1, 0};
    int deltaCol[] = {0, 1, 0, -1};
    dfs(sr, sc, color, initialColor, ans, image, deltaRow, deltaCol);
    return ans;
  }

  public static void dfs(int row, int col, int color, int initialColor, int[][] ans, int[][] image, int[] deltaRow, int[] deltaCol) {

    ans[row][col] = color;
    int n = image.length;
    int m = image[0].length;
    for (int i = 0; i < 4; i++) {
      int nrow = row + deltaRow[i];
      int ncol = col + deltaCol[i];
      if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m
          && image[nrow][ncol] == initialColor && ans[nrow][ncol] != color) {
        dfs(nrow, ncol, color, initialColor, ans, image, deltaRow, deltaCol);
      }
    }
  }

}
