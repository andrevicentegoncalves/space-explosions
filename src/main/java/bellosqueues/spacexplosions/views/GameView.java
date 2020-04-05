package bellosqueues.spacexplosions.views;

import bellosqueues.spacexplosions.persistence.model.Player;
import bellosqueues.spacexplosions.persistence.model.position.grid.SimpleGfxPosition;
import bellosqueues.spacexplosions.services.MapService;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameView {

    private Picture background = new Picture(10,10, "images/space_arena.png");
    private Picture player;

    public GameView(Player player){
        SimpleGfxPosition pos = new SimpleGfxPosition(player.getPosition());
        this.player = new Picture(pos.getCol(), pos.getRow(), "images/ship.png");
    }


    public void show(){

        /**
         TODO
         background
         player && obstacles
         */


        MapService mapService = new MapService(28,8);
        mapService.init();
        background.draw();
        player.draw();
    }

}
