package design_pattern.com.company.tic_tac_toe_lld;

public class Game {

    public static void main(String[] args) {
        TicTacToeGame ticTacToeGame = new TicTacToeGame();
        System.out.println("Game Winner is "+ ticTacToeGame.startGame());
        ticTacToeGame.printFinalResult();
    }
}
