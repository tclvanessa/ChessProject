public class ChessBoard {
    private ChessPiece[][] board;

    // initializing the board to null first
    public ChessBoard() {
        board = new ChessPiece[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = null;
            }
        }
    }

    // setting the piece on the board!
    public void setPiece(String piece, int col, int row)  {
        if (piece.equals("pawn")) {
            board[col][row] = new Pawn();
            board[col][row].setCoord(col, row);
        }
        else if (piece.equals("rook")) {
            board[col][row] = new Rook();
            board[col][row].setCoord(col, row);
        }
        else if (piece.equals("knight")) {
            board[col][row] = new Knight();
            board[col][row].setCoord(col, row);
        }
        else if (piece.equals("bishop")) {
            board[col][row] = new Bishop();
            board[col][row].setCoord(col, row);
        }
        else if (piece.equals("queen")) {
            board[col][row] = new Queen();
            board[col][row].setCoord(col, row);
        }
        else if (piece.equals("king")) {
            board[col][row] = new King();
            board[col][row].setCoord(col, row);
        }
    }

    public ChessPiece getSpace(int col, int row){
        return board[col][row];
    }

    public void setEmpty(int col, int row) {
        board[col][row] = null;
    }

    public String toString() {
        String returnString = "";
        for (int i = board.length - 1; i >= 0; i--) {
            for (int j = 0; j < board.length; j++) {
                if (j == 0) {
                    returnString += "\n=" + i + "=";
                }
                if(board[j][i] == null) {
                    returnString += " --- ";
                } else {
                    returnString += board[j][i];
                }
            }
        }
        returnString += "\n===";
        for (int i = 0; i < board.length; i++){
            returnString += " =" + i + "= ";
        }
        return returnString;
    }
}
