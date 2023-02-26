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
}
