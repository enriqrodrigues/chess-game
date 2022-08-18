package com.henrique;

import com.henrique.chess.ChessMatch;

public class ChessGameApplication {

    public static void main(String[] args) {

        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());

    }

}
