package nelios.udemy.chess;

import lombok.Getter;
import nelios.udemy.boardgame.Board;
import nelios.udemy.boardgame.Piece;

public class ChessPiece extends Piece {

    @Getter
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
}
