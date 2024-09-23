package design_pattern.com.company.tic_tac_toe_lld.model.player;

import design_pattern.com.company.tic_tac_toe_lld.model.piece.Piece;

public class Player {
    private String name;

    private Piece playingPiece;


    public Player(String name, Piece playingPiece) {
        this.name = name;
        this.playingPiece = playingPiece;
    }

    public String getName() {
        return name;
    }

    public Piece getPlayingPiece() {
        return playingPiece;
    }

}
