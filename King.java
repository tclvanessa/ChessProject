public class King extends ChessPiece {
    public King() {
        super.name = "K";
        super.row = 0;
        super.col = 0;
    }

    @Override
    public boolean validMove(int col, int row) {
        if (row == getRow() - 1 || row == getRow() + 1 || col == getColumn() - 1 || col == getColumn() +1) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
