package Entities.Chess.pieces;

import Entities.BoardGame.Board;
import Entities.Chess.ChessPiece;
import Entities.Chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "T";
    }
}

