package nelios.udemy.chess.pieces;

import nelios.udemy.boardgame.Board;
import nelios.udemy.chess.ChessPiece;
import nelios.udemy.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }

}
