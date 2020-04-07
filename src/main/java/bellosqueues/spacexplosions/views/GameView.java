package bellosqueues.spacexplosions.views;

import bellosqueues.spacexplosions.utilities.PicturePaths;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameView {

    //Objects are drawn when positions are created, therefore this View will give positions to objects.

    private Picture background = new Picture(10,10, PicturePaths.SPACE_PIC);
  //  private Player player;


    public GameView(){
    }

    public void start(){

        /**
         TODO
         background
         player && obstacles
         */

        background.draw();

      //  player.draw();

    }

}
