package Entities.Chess.pieces;

import Entities.BoardGame.Board;
import Entities.Chess.ChessPiece;
import Entities.Chess.Color;

public class Queen extends ChessPiece {

    public Queen(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}


