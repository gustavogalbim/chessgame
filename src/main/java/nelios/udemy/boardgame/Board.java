package nelios.udemy.boardgame;

import lombok.Getter;
import lombok.Setter;
import nelios.udemy.boardgame.exceptions.BoardException;

public class Board {

    @Getter
    private int rows;
    @Getter
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {

        if(rows < 1 || columns < 1) {
            throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
        }

        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column) {
        if(!positionExists(row, column)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if(!positionExists(position)) {
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        if(thereIsPiece(position)) {
            throw new BoardException("This piece already exists on this position " +position);
        }
        this.pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column) {
        return row>= 0 && row < rows && column >= 0 && column < columns;
    }

    public boolean positionExists(Position position) {
    return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsPiece(Position position) {
        if(!positionExists(position)) {
            throw new BoardException("This position already exists");
        }
        return piece(position) != null;
    }
}
