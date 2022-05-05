public abstract class ChessPiece {
    protected String name;
    protected int row, col;

    public ChessPiece() {
        this.name = null;
        this.row = 0;
        this.col = 0;
    }

    public ChessPiece(String cPiece, int row, int col) {
        this.name = cPiece;
        this.row = row;
        this.col = col;
    }

    public void setCoord(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.col;
    }

    public String toString() {
        return " -" + this.name + "- ";
    }

    public abstract boolean validMove(int row, int col);
}

