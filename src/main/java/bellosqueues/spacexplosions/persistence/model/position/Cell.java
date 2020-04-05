package bellosqueues.spacexplosions.persistence.model.position;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class Cell {

  private Position position;
  private Rectangle cell;
  //private Picture xWingCell;

  public Cell(Position position){
    this.position = position;
    cell = new Rectangle(Map.PADDING + position.getCol() * Map.CELLSIZE, Map.PADDING + position.getRow() * Map.CELLSIZE, Map.CELLSIZE, Map.CELLSIZE);
    cell.setColor(Color.WHITE);
    cell.draw();
    cell.fill();
  }

  public Position getPos(){
    return position;
  }

}
