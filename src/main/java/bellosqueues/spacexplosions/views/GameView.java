package bellosqueues.spacexplosions.views;

import bellosqueues.spacexplosions.services.MapService;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameView {

    /*
    TODO
    background
    player && obstacles
    */

  public static void main(String[] args) {

        Picture background = new Picture(10,10,"src/main/resources/images/space_arena.png");

        MapService mapService = new MapService(28,8);
        mapService.init();
        background.draw();


  }

}
