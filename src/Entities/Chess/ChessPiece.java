package Entities.Chess;

import Entities.BoardGame.Board;
import Entities.BoardGame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}

