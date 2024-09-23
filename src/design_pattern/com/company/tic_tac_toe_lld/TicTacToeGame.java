package design_pattern.com.company.tic_tac_toe_lld;

import design_pattern.com.company.tic_tac_toe_lld.model.board.Board;
import design_pattern.com.company.tic_tac_toe_lld.model.piece.PieceO;
import design_pattern.com.company.tic_tac_toe_lld.model.piece.PieceType;
import design_pattern.com.company.tic_tac_toe_lld.model.piece.PieceX;
import design_pattern.com.company.tic_tac_toe_lld.model.player.Player;
import design_pattern.com.company.tic_tac_toe_lld.util.Pair;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {

    Deque<Player> players;
    Board gameBoard;

    public TicTacToeGame() {
        initializeGame();
    }

    private void initializeGame() {
        players = new LinkedList<>();
        Player player1 = new Player("Imptez", new PieceX());
        Player player2 = new Player("Sasmita", new PieceO());

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame() {

        boolean noWinner = true;
        while (noWinner) {
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();
            List<Pair<Integer, Integer>> freeCells = gameBoard.getFreeCells();
            if (freeCells.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.println("Player: " + playerTurn.getName() + " Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);
            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSuccessfully = gameBoard.addPiece(inputRow, inputColumn, playerTurn.getPlayingPiece());
            if (!pieceAddedSuccessfully) {
                System.out.println("\nIncorrect position, try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);
            if (isThereWinner(inputRow, inputColumn, playerTurn.getPlayingPiece().getPieceType())) {
                return playerTurn.getName();
            }
        }
        return "Tie";
    }

    public boolean isThereWinner(int row, int col, PieceType pieceType) {

        int n = gameBoard.board.length;
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        //need to check in row
        for (int j = 0; j < n; j++) {

            if (gameBoard.board[row][j] == null || gameBoard.board[row][j] != pieceType) {
                rowMatch = false;
            }
        }

        for (int i = 0; i < n; i++) {

            if (gameBoard.board[i][col] == null || gameBoard.board[i][col] != pieceType) {
                columnMatch = false;
            }
        }

        for (int i = 0, j = 0; i < n && j < n; i++, j++) {

            if (gameBoard.board[i][j] == null || gameBoard.board[i][j] != pieceType) {
                diagonalMatch = false;
            }
        }

        for (int i = 0, j = n - 1; i < n && j >= 0; i++, j--) {

            if (gameBoard.board[i][j] == null || gameBoard.board[i][j] != pieceType) {
                antiDiagonalMatch = false;
            }
        }

        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }

    public void printFinalResult() {
        System.out.println("\nFinal Result:");
        gameBoard.printBoard();
    }
}
