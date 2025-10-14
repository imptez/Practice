package bosscoder.backtracking;

import java.util.ArrayList;
import java.util.List;

public class RatInAMazePossibilities {
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

        List<String> paths = new ArrayList<>();
        ratInMaze(0, 0, maze, "", paths);
        paths.forEach(System.out::println);
    }

    static void ratInMaze(int i, int j, int[][] maze, String path, List<String> paths) {
        int m = maze.length;
        int n = maze[0].length;
        if (i < 0 || j < 0 || i >= m || j >= n) return ;

        if (maze[i][j] == 0 || maze[i][j] == 11) return ;

        if (i == m - 1 && j == n - 1) {
            paths.add(path);
            return ;
        }


        maze[i][j] = 11;

        // Explore all directions
        ratInMaze(i, j - 1, maze,path+"L",paths); // left
        ratInMaze(i + 1, j, maze,path+"D",paths); // down
        ratInMaze(i, j + 1, maze,path+"R",paths); // right
        ratInMaze(i - 1, j, maze,path+"U",paths); // up

        maze[i][j] = 1;
    }
}
