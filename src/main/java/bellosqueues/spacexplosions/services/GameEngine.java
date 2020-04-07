package bellosqueues.spacexplosions.services;

import bellosqueues.spacexplosions.factories.EnemiesFactory;
import bellosqueues.spacexplosions.persistence.model.Player;
import bellosqueues.spacexplosions.persistence.model.enemies.Obstacles;
import bellosqueues.spacexplosions.persistence.model.enemies.ObstaclesTypes;
import bellosqueues.spacexplosions.persistence.model.position.LogicPosition;
import bellosqueues.spacexplosions.persistence.model.position.SimpleGfxPosition;
import bellosqueues.spacexplosions.utilities.PicturePaths;
import bellosqueues.spacexplosions.views.GameView;
import bellosqueues.spacexplosions.views.MainMenuView;

public class GameEngine {

    private PlayerService playerService;

    private Obstacles[] asteroidField;
    private MapService map;
    private MainMenuView menuView;
    private MapService mapService;

    private GameView gameView;

    private int cols;
    private int rows;

    private Player player;


    public GameEngine(int cols, int rows){
        this.cols = cols;
        this.rows = rows;
        init();
    }


    /**
     * Game Initialization
     */
    public void init(){

        gameView = new GameView();
        player = new Player();

    }

    /**
     * Start Game
     */
    public void start(){

        gameView.start();
        player.setPosition(new SimpleGfxPosition(1,4, PicturePaths.SHIP_PIC));
        playerService.setPlayer(player);

    }

    public void setPlayerService(PlayerService playerService) {
        this.playerService = playerService;
    }
}
