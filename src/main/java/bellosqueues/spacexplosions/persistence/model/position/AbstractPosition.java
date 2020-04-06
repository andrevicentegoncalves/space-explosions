package bellosqueues.spacexplosions.persistence.model.position;

public abstract class AbstractPosition implements Position {

    private int col;
    private int row;

    public AbstractPosition(int col, int row){
        this.col = col;
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int dif) {
        this.col += dif;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int dif) {
        this.row += dif;
    }
}
