import java.io.*;
import java.util.*;

public class ChessMoves {
    public static void main(String[] args) throws FileNotFoundException, OutOfBoardException, IllegalChessMoveException {
        ChessBoard board = new ChessBoard();
        Scanner scan = new Scanner(new File("input2.txt"));
        String line;
        String[] lineSegment;

        try {
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                lineSegment = line.split(" "); // stores all input in array of Strings

                // setting the pieces down
                if (lineSegment[0].equals("pawn") || lineSegment[0].equals("rook") || lineSegment[0].equals("knight") || lineSegment[0].equals("bishop")) {
                    if (Integer.parseInt(lineSegment[1]) < 0 || Integer.parseInt(lineSegment[2]) < 0 || Integer.parseInt(lineSegment[1]) > 8 || Integer.parseInt(lineSegment[2]) > 8) {
                        throw new OutOfBoardException("Invalid Board Position");
                    }
                    board.setPiece(lineSegment[0], Integer.parseInt(lineSegment[1]), Integer.parseInt(lineSegment[2]));
                }
                // the moving part
                else if (lineSegment[0].equals("move")) {
                    int theCol = Integer.parseInt(lineSegment[1]);
                    int theRow = Integer.parseInt(lineSegment[2]);
                    int nextMoveCol = Integer.parseInt(lineSegment[3]);
                    int nextMoveRow = Integer.parseInt(lineSegment[4]);

                    String name = "";
                    if (board.getSpace(theCol, theRow).getName().equals("p")) {
                        name = "pawn";
                    } else if (board.getSpace(theCol, theRow).getName().equals("r")) {
                        name = "rook";
                    } else if (board.getSpace(theCol, theRow).getName().equals("h")) {
                        name = "knight";
                    } else if (board.getSpace(theCol, theRow).getName().equals("b")) {
                        name = "bishop";
                    }

                    if (Integer.parseInt(lineSegment[1]) < 0 || Integer.parseInt(lineSegment[2]) < 0 || Integer.parseInt(lineSegment[1]) > 8 || Integer.parseInt(lineSegment[2]) > 8) {
                        throw new OutOfBoardException("Invalid Board Position.");
                    }

                    if (board.getSpace(nextMoveCol, nextMoveRow) == null && board.getSpace(theCol, theRow) != null) {
                        if (board.getSpace(theCol, theRow).validMove(nextMoveCol, nextMoveRow)) {
                            board.setPiece(name, nextMoveCol, nextMoveRow);
                            System.out.println("\n" + name.toUpperCase() + ": (" + theCol + ", " + theRow + ") (" + nextMoveCol + ", " + nextMoveRow + ")");
                            System.out.println("Moved! (" + theCol + ", " + theRow + ") (" + nextMoveCol + ", " + nextMoveRow + ")");
                            board.setEmpty(theCol, theRow);
                            System.out.println("==========================================");
                            System.out.println(board);
                        } else {
                            System.out.println("\n" + name.toUpperCase() + ": (" + theCol + ", " + theRow + ") (" + nextMoveCol + ", " + nextMoveRow + ")");
                            System.out.println("Invalid move. (" + theCol + ", " + theRow + ") (" + nextMoveCol + ", " + nextMoveRow + ")");
                            System.out.println("==========================================");
                            System.out.println(board);
                            throw new IllegalChessMoveException("Illegal Chess Move.");
                        }
                    }
                }
            }
        }
        catch (OutOfBoardException | IllegalChessMoveException e) {
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("\nFinal result:" + board);
        }
    }
}
