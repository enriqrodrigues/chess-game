package com.henrique.chess.pieces;

import com.henrique.boardgame.Board;
import com.henrique.chess.ChessPiece;
import com.henrique.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }
}
