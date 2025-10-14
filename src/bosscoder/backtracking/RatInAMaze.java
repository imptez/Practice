package bosscoder.backtracking;

public class RatInAMaze {
    /**
     * A rat cannot visit the same cell more than once in a path.
     * 1 represents an open cell (rat can visit), and 0 represents a blocked cell (rat cannot visit).
     */
    public static void main(String[] args) {
        int[][] maze = {
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };

        System.out.println(ratInMaze(0, 0, maze));


    }

    static boolean ratInMaze(int i, int j, int[][] maze) {
        int m = maze.length;
        int n = maze[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) return false;

        if (maze[i][j] == 0 || maze[i][j] == 11) return false;

        if (i == m - 1 && j == n - 1) return true;


        maze[i][j] = 11;

        // Explore all directions
        if (ratInMaze(i, j - 1, maze)) return true; // left
        if (ratInMaze(i + 1, j, maze)) return true; // down
        if (ratInMaze(i, j + 1, maze)) return true; // right
        if (ratInMaze(i - 1, j, maze)) return true; // up
        
        maze[i][j] = 1;

        return false;

    }
}
