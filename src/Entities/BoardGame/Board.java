package Entities.BoardGame;

import Exceptions.BoardException;

public class Board {

    private int rows;
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) throws BoardException {
        if(rows < 1 || columns < 1) throw new BoardException("Error creating board: at least 1 row and 1 col.");

        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public Piece getPiece(int row, int col) throws BoardException {
        if(!positionExists(row, col)) throw new BoardException("Error: position not on the board");
        return pieces[row][col];
    }

    public Piece getPiece(Position pos) throws BoardException {
        if(!positionExists(pos)) throw new BoardException("Error: position not on the board");
        return pieces[pos.getRow()][pos.getColumn()];
    }

    public void placePieces(Piece piece, Position position) throws BoardException {
        if(thereIsAPiece(position)) throw new BoardException("Error: position not empty ("+position+")");

        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public boolean positionExists(int row, int col) {
        return row >= 0 && row < rows && col >= 0 && col < columns;
    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position) throws BoardException {
        if(!positionExists(position)) throw new BoardException("Error: position not on the board.");
        return getPiece(position) != null;
    }
}



