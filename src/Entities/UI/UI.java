package Entities.UI;

import Entities.Chess.ChessPiece;
import Entities.Chess.ChessPosition;
import Entities.Chess.Color;

import java.util.Scanner;

public class UI {

    public static final String reset = "\u001B[0m";
    public static final String yellow = "\u001B[33m";

    public static void printBoard(ChessPiece[][] pieces) {
        for(int i = 0; i < pieces.length; i++) {
            System.out.print((8 - i) + " ");

            for(int j = 0; j < pieces.length; j++) printPiece(pieces[i][j]);

            System.out.println();
        }

        System.out.println("  " + "a b c d e f g h");
    }

    private static void printPiece(ChessPiece piece) {
        if(piece == null) System.out.print("- ");
        else {
            if(piece.getColor() == Color.BLACK) System.out.print(yellow + piece + " " + reset);
            else System.out.print(piece + " " + reset);
        }
    }

    public static ChessPosition readChessPosition(Scanner sc) {
        String s = sc.nextLine();
        char col = s.charAt(0);
        int row = Integer.parseInt(s.substring(1));

        return new ChessPosition(col, row);
    }
}




