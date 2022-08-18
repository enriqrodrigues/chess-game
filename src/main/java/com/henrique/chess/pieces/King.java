package com.henrique.chess.pieces;

import com.henrique.boardgame.Board;
import com.henrique.chess.ChessPiece;
import com.henrique.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
