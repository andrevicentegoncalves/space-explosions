package bellosqueues.spacexplosions;

import bellosqueues.spacexplosions.controllers.KeyboardController;
import bellosqueues.spacexplosions.persistence.model.Player;
import bellosqueues.spacexplosions.services.GameEngine;
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
        PlayerService playerService = new PlayerService();

        KeyboardController kb = new KeyboardController();
        kb.setPlayerService(playerService);

        GameEngine gameEngineService = new GameEngine(28,10);
        gameEngineService.setPlayerService(playerService);
        gameEngineService.start();

    }

}
