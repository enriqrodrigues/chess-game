package com.henrique;

import com.henrique.chess.ChessMatch;
import com.henrique.chess.ChessPiece;
import com.henrique.chess.ChessPosition;

import java.util.Scanner;

public class ChessGameApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while(true) {
            UI.printBoard(chessMatch.getPieces());

            System.out.println();
            System.out.println("Source: ");
            ChessPosition source = UI.readChessPosition(sc);

            System.out.println();
            System.out.println("Target: ");
            ChessPosition target = UI.readChessPosition(sc);

            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }

}
