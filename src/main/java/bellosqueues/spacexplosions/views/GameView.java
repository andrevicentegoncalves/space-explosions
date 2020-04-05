package bellosqueues.spacexplosions.views;

import bellosqueues.spacexplosions.services.MapService;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameView {

  Picture background = new Picture(10,10,"src/main/resources/images/space_arena.jpg");

  public void show(){

        /**
         TODO
         background
         player && obstacles
         */

    MapService mapService = new MapService(28,10);
    mapService.init();
    background.draw();

    }

}
