public class Queen extends ChessPiece {
    public Queen() {
        super.name = "Q";
        super.row = 0;
        super.col = 0;
    }

    @Override
    public boolean validMove(int col, int row) {
        if (getColumn() == col) {
            if (row >= 1 && row <= 8) {
                return true;
            }
        }
        else if (getRow() == row) {
            if (col >= 1 && row <= 8) {
                return true;
            }
        }
        else if (Math.abs(getColumn() - col) == Math.abs(getRow() - row)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
