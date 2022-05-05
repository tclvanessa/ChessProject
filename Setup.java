import java.io.*;
import java.util.*;

public class Setup {
    public static void main(String[] args) throws FileNotFoundException, OutOfBoardException {
        ChessBoard board = new ChessBoard();
        Scanner scan = new Scanner(new File("input1.txt"));
        String line;
        String[] lineSegment;

        while (scan.hasNextLine()) {
            line = scan.nextLine();
            lineSegment = line.split(" "); // stores all input in array of Strings
            if (lineSegment[0].equals("pawn") || lineSegment[0].equals("rook") || lineSegment[0].equals("knight") || lineSegment[0].equals("bishop")) {
                board.setPiece(lineSegment[0], Integer.parseInt(lineSegment[1]), Integer.parseInt(lineSegment[2]));
            }
        }
        System.out.println(board);
    }
}