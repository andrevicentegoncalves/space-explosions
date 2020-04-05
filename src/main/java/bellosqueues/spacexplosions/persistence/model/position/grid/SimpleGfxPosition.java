package bellosqueues.spacexplosions.persistence.model.position.grid;

import bellosqueues.spacexplosions.persistence.model.position.AbstractPosition;
import bellosqueues.spacexplosions.persistence.model.position.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import static bellosqueues.spacexplosions.persistence.model.position.grid.Map.*;

public class SimpleGfxPosition extends AbstractPosition {

  public SimpleGfxPosition(Position position){
    super(PADDING + position.getCol()*CELLSIZE, PADDING + position.getRow()*CELLSIZE);
  }


}
