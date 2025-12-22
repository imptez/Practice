package bosscoder.backtracking;

import java.util.*;

public class NQueens {

    static List<List<String>> colBoard = new ArrayList<>();

    public static void main(String[] args) {
        int n = 1;
        boolean[][] board = new boolean[n][n];
        getQueens(board, n, 0);
        colBoard.forEach(System.out::println);
    }

    static void getQueens(boolean[][] board, int index, int row) {
        if (row == index) {
            colBoard.add(construct(board));
            return;
        }

        for (int col = 0; col < index; col++) {
            board[row][col] = true;
            if (isValid(board, row, col, index)) {
                getQueens(board, index, row + 1);
            }
            board[row][col] = false;
        }
    }

    static boolean isValid(boolean[][] board, int row, int col, int index) {
        // check for row
        for (int i = 0; i < index; i++) {
            if (board[row][i] && i != col) {
                return false;
            }
        }

        // check for column
        for (int i = 0; i < index; i++) {
            if (board[i][col] && i != row) {
                return false;
            }
        }

        // upper-left diagonal
        int tr1 = row - 1;
        int tc1 = col - 1;
        while (tr1 >= 0 && tc1 >= 0) {
            if (board[tr1][tc1]) {
                return false;
            }
            tr1--;
            tc1--;
        }

        // lower-right diagonal
        int tr2 = row + 1;
        int tc2 = col + 1;
        while (tr2 < index && tc2 < index) {
            if (board[tr2][tc2]) {
                return false;
            }
            tr2++;
            tc2++;
        }

        // upper-right diagonal
        int tr3 = row - 1;
        int tc3 = col + 1;
        while (tr3 >= 0 && tc3 < index) {
            if (board[tr3][tc3]) {
                return false;
            }
            tr3--;
            tc3++;
        }

        // lower-left diagonal
        int tr4 = row + 1;
        int tc4 = col - 1;
        while (tr4 < index && tc4 >= 0) {
            if (board[tr4][tc4]) {
                return false;
            }
            tr4++;
            tc4--;
        }

        return true;
    }

    static List<String> construct(boolean[][] board) {
        List<String> res = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? "Q" : ".");
            }
            res.add(sb.toString());
        }
        return res;
    }

}
