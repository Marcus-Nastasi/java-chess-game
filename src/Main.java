import Entities.Chess.ChessMatch;
import Entities.UI.UI;
import Exceptions.BoardException;

public class Main {

    public static void main(String[] args) {
        try {
            ChessMatch chessMatch = new ChessMatch();
            UI.printBoard(chessMatch.getPieces());
        } catch(BoardException e) {
            System.err.println(e.getMessage() + "\n");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}


