package bellosqueues.spacexplosions.views;

import bellosqueues.spacexplosions.persistence.model.Player;
import bellosqueues.spacexplosions.persistence.model.position.grid.SimpleGfxPosition;
import bellosqueues.spacexplosions.services.MapService;
import bellosqueues.spacexplosions.utilities.Directions;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameView {


    private Picture background = new Picture(10,10, "images/space_arena.jpeg");
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

        MapService mapService = new MapService(28,10);
        mapService.init();
        background.draw();
        player.draw();

    }

    public void moveView(Directions direction) {

        switch (direction) {

            case UP:
                player.translate(0,-1);
            case DOWN:
                player.translate(0,+1);
            case LEFT:
                player.translate(-1,0);
            case RIGHT:
                player.translate(+1,0);
        }
    }
}
