package Entities.Chess;

import Entities.BoardGame.Board;
import Entities.BoardGame.Piece;
import Entities.BoardGame.Position;
import Entities.Chess.pieces.King;
import Entities.Chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] match = new ChessPiece[board.getRows()][board.getColumns()];

        for(int i = 0; i < board.getRows(); i++) {
            for(int j = 0; j < board.getColumns(); j++) match[i][j] = (ChessPiece)board.getPiece(i, j);
        }

        return match;
    }

    private void placeNewPiece(char col, int row, ChessPiece piece) {
        board.placePieces(piece, new ChessPosition(col, row).toPosition());
    }

    private void initialSetup() {
        placeNewPiece(
            'e', 8, new King(board, Color.WHITE)
        );
        placeNewPiece(
            'a', 8, new Rook(board, Color.WHITE)
        );
        placeNewPiece(
            'h', 8, new Rook(board, Color.WHITE)
        );
    }
}


