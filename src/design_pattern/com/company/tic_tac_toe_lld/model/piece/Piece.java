package design_pattern.com.company.tic_tac_toe_lld.model.piece;

public class Piece {
    PieceType pieceType;

    public Piece(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public PieceType getPieceType() {
        return pieceType;
    }
}
