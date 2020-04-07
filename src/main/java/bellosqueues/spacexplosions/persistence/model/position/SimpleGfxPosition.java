package bellosqueues.spacexplosions.persistence.model.position;

import bellosqueues.spacexplosions.persistence.model.position.AbstractPosition;
import bellosqueues.spacexplosions.persistence.model.position.Position;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import static bellosqueues.spacexplosions.persistence.model.position.grid.Map.*;

public class SimpleGfxPosition extends AbstractPosition {

  private Picture picture;

  public SimpleGfxPosition(int col, int row, String imagePath){
    super(col, row);
    picture = new Picture(PADDING + col*CELLSIZE, PADDING + row*CELLSIZE, imagePath);
    picture.draw();
  }

  public void setCol(int dif) {
    this.col += dif;
    picture.translate(dif*CELLSIZE, 0);
  }

  public void setRow(int dif) {
    this.row += dif;
    picture.translate(0, dif*CELLSIZE);
  }

}
