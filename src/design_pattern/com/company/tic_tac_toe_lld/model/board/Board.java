package design_pattern.com.company.tic_tac_toe_lld.model.board;

import design_pattern.com.company.tic_tac_toe_lld.model.piece.Piece;
import design_pattern.com.company.tic_tac_toe_lld.model.piece.PieceType;
import design_pattern.com.company.tic_tac_toe_lld.util.Pair;
import java.util.ArrayList;
import java.util.List;

public class Board {
    public PieceType[][] board;
    private int size;

    public Board(int size) {
        this.size = size;
        this.board = new PieceType[size][size];
    }


    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (this.board[i][j] != null) {
                    System.out.print(this.board[i][j] + "  ");
                } else {
                    System.out.print("   ");
                }
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    public List<Pair<Integer, Integer>> getFreeCells() {
        List<Pair<Integer, Integer>> freeCells = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (this.board[i][j] == null) {
                    freeCells.add(new Pair<>(i, j));
                }
            }
        }
        return freeCells;
    }

    public boolean addPiece(int inputRow, int inputColumn, Piece playingPiece) {
        if (inputColumn <= size - 1 && inputColumn >= 0 && inputColumn <= size - 1 && inputColumn >= 0) {
            if (this.board[inputRow][inputColumn] != null) {
                return false;
            }
            this.board[inputRow][inputColumn] = playingPiece.getPieceType();
            return true;
        }
        return false;
    }
}
