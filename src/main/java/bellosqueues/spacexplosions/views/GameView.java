package bellosqueues.spacexplosions.views;

import bellosqueues.spacexplosions.persistence.model.Player;
import bellosqueues.spacexplosions.persistence.model.enemies.Asteroid;
import bellosqueues.spacexplosions.persistence.model.position.grid.Map;
import bellosqueues.spacexplosions.persistence.model.position.grid.SimpleGfxPosition;
import bellosqueues.spacexplosions.services.GameEngineService;
import bellosqueues.spacexplosions.services.MapService;
import bellosqueues.spacexplosions.utilities.Directions;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class GameView {

    //Objects are drawn when positions are created, therefore this View will give positions to objects.

    private Picture background = new Picture(10,10, "images/space_arena.jpeg");
    private Player player;


    public GameView(Player player){
        this.player = player;
    }


    public void show(){

        /**
         TODO
         background
         player && obstacles
         */

        GameEngineService gameEngineService = new GameEngineService(28,10);
        gameEngineService.start();
        background.draw();
        player.setPosition(new SimpleGfxPosition(1,4, "/images/ship.png"));
      //  player.draw();

    }

   public void moveView(Directions direction) {
/*
        switch (direction) {

            case UP:
                player.translate(0,-Map.CELLSIZE);
                break;
            case DOWN:
                player.translate(0,+Map.CELLSIZE);
                break;
            case LEFT:
                player.translate(-Map.CELLSIZE,0);
                break;
            case RIGHT:
                player.translate(+Map.CELLSIZE,0);
                break;
        }*/
    }
}
