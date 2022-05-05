public class Knight extends ChessPiece {
    public Knight() {
        super.name = "h";
        super.row = 0;
        super.col = 0;
    }

    @Override
    public boolean validMove(int col, int row) {
        if (col >= 1 && col <= 8 && row >= 1 && row <= 8) {
            int c = Math.abs(col - getColumn());
            int r = Math.abs(row - getRow());

            if (c == 2 && r == 1) {
                return true;
            }
            else if (c == 1 && r == 2) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
