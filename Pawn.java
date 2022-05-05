public class Pawn extends ChessPiece {
    private boolean firstMove;

    public Pawn() {
        super.name = "p";
        super.row = 0;
        super.col = 0;
        this.firstMove = false;
    }

    @Override
    public boolean validMove(int col, int row) {
        if (this.firstMove == false)
        {
            if (getColumn() == col) {
                if(row == getRow() - 2 || row == getRow() - 1 || row == getRow() + 1 || row == getRow() + 2) {
                    this.firstMove = true;
                    return true;
                }
            }
        }
        else {
            if (getColumn() == col) {
                if (row == getRow() - 1 || row == getRow() + 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
