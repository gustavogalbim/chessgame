package nelios.udemy.boardgame;

import lombok.Getter;
import lombok.Setter;

public class Board {

    @Getter
    private int rows;
    @Getter
    private int columns;
    private Piece[][] pieces;

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];
    }

    public Piece piece(int row, int column) {
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position) {
        this.pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }
}
