package com.henrique.boardgame;

public class Piece {

    protected Position position;
    private Board board;

    //A posição inicial da peça será nula, pois ela será inserida no tabuleiro depois.
    public Piece(Board board) {
        this.board = board;
        position = null;
    }

    protected Board getBoard() {
        return board;
    }

}
