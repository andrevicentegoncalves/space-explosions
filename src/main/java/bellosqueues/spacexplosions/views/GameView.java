package bellosqueues.spacexplosions.views;

import bellosqueues.spacexplosions.services.MapService;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameView {

    public void show(){

        /**
         TODO
         background
         player && obstacles
         */
        Picture background = new Picture(10,10,"src/main/resources/images/space_arena.png");

        MapService mapService = new MapService(28,8);
        mapService.init();
        background.draw();
    }

}
