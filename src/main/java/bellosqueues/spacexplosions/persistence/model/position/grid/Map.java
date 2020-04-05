package bellosqueues.spacexplosions.persistence.model.position.grid;

import bellosqueues.spacexplosions.persistence.model.position.LogicPosition;

public class Map {

  public static final int PADDING = 10;
  public static final int CELLSIZE = 50;

  protected TupperWare container;
  private int cols;
  private int rows;



  public Map(int cols, int rows){
    this.cols = cols;
    this.rows = rows;
    container = new TupperWare();
    populateContainer();
  }


  protected void populateContainer(){
    for (int col = 0; col < rows; col++) {
      for (int row = 0; row < rows; row++) {
        LogicPosition position = new LogicPosition(col, row);
        container.addCell(position);
      }
    }
  }

  public int getCols(){
    return cols;
  }

  public int getRows(){
    return rows;
  }

}
