package Entities.Chess;

import Entities.BoardGame.Board;
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
            for(int j = 0; j < board.getColumns(); j++) match[i][j] = (ChessPiece)board.getPieces(i, j);
        }

        return match;
    }

    private void initialSetup() {
        board.placePieces(
            new Rook(board, Color.WHITE), new Position(0, 0)
        );
        board.placePieces(
                new Rook(board, Color.WHITE), new Position(0, 7)
        );
        board.placePieces(
            new King(board, Color.WHITE), new Position(0, 4)
        );
    }
}


