public class Bishop extends ChessPiece {
    public Bishop() {
        super.name = "b";
        super.row = 0;
        super.col = 0;
    }

    @Override
    public boolean validMove(int col, int row) {
        if (Math.abs(getColumn() - col) == Math.abs(getRow() - row)) {
            return true;
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
