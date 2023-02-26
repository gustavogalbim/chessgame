package nelios.udemy.boardgame;

import lombok.Getter;
import lombok.Setter;

public class Position {

    @Getter @Setter
    private int row;
    @Getter @Setter
    private int column;

    public Position(){
    }

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString(){
        return row + ", " + column;
    }
}
