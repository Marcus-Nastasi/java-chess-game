import Entities.Chess.ChessMatch;
import Entities.UI.UI;

public class Main {

    public static void main(String[] args) {
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}


