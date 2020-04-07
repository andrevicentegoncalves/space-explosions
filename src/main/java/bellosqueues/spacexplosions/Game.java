package bellosqueues.spacexplosions;

import bellosqueues.spacexplosions.controllers.KeyboardController;
import bellosqueues.spacexplosions.persistence.model.Player;
import bellosqueues.spacexplosions.persistence.model.enemies.Asteroid;
import bellosqueues.spacexplosions.persistence.model.position.LogicPosition;
import bellosqueues.spacexplosions.persistence.model.position.grid.SimpleGfxPosition;
import bellosqueues.spacexplosions.services.GameEngineService;
import bellosqueues.spacexplosions.services.PlayerService;
import bellosqueues.spacexplosions.views.GameView;

public class Game {

    public static void main(String[] args) {

        /*
        Picture background = new Picture(10,10, "images/space_arena.png");
        background.draw();


        Picture ship = new Picture(50,200, "images/ship.png");
        ship.draw();

        Asteroid ast1 = new Asteroid(300, 200);
        Asteroid ast2 = new Asteroid(500, 300);
        Asteroid ast3 = new Asteroid(400, 100);
*/
        Player player = new Player();

        GameView test = new GameView(player);

        PlayerService playerService = new PlayerService();
        playerService.setPlayer(player);

        GameEngineService game = new GameEngineService(28,10);
        KeyboardController kb = new KeyboardController(game);
        kb.setPlayerService(playerService);
        kb.setGameView(test);

        test.show();
    }

}
