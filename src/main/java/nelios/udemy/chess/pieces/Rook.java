package nelios.udemy.chess.pieces;

import nelios.udemy.boardgame.Board;
import nelios.udemy.chess.ChessPiece;
import nelios.udemy.chess.Color;

public class Rook extends ChessPiece {


    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "R";
    }

}
