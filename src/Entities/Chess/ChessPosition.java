package Entities.Chess;

import Entities.BoardGame.Position;
import Exceptions.ChessException;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8) throw new ChessException("Error: values from a1 to h8");

        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position((8 - row), (column - 'a'));
    }

    protected static ChessPosition fromPosition(Position pos) {
        return new ChessPosition((char)('a' - pos.getColumn()), (8 - pos.getRow()));
    }

    @Override
    public String toString() {
        return "" + column + row;
    }
}



