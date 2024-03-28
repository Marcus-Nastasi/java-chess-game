package Entities.Chess.pieces;

import Entities.BoardGame.Board;
import Entities.Chess.ChessPiece;
import Entities.Chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}


