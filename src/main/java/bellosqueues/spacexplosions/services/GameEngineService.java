package bellosqueues.spacexplosions.services;

import bellosqueues.spacexplosions.factories.EnemiesFactory;
import bellosqueues.spacexplosions.persistence.model.enemies.Obstacles;
import bellosqueues.spacexplosions.persistence.model.enemies.ObstaclesTypes;
import bellosqueues.spacexplosions.persistence.model.position.LogicPosition;
import bellosqueues.spacexplosions.views.MainMenuView;

public class GameEngineService {

  private Obstacles[] asteroidField;
  private LogicPosition position;
  private MapService map;
  EnemiesFactory enemiesFactory = new EnemiesFactory();
  private int cols;
  private int rows;

  public GameEngineService(int cols, int rows){
    this.cols = cols;
    this.rows = rows;
  }



  /**
   * Keyboard Boolean Properties
   */
  private boolean keySpace;
  private boolean keyRestart;
  private boolean keyMute;
  private boolean keyFire;
  private MainMenuView menuView;
  private MapService mapService;


  /**
   * Game Initialization
   */
  public void init(){

      menuView.show();

  }

  /**
   * Start Game
   */
  public void start(){

    // MAP INICIALIZATION
    map = new MapService(cols, rows);
    position = new LogicPosition(cols, rows);

    // ASTEROIDS
    asteroidField = new Obstacles[15];

    for (int i = 0; i < asteroidField.length; i++) {
          asteroidField[i] = enemiesFactory.displayEnemies(ObstaclesTypes.ASTEROID, position);
      }
  }

  /**
   * Keyboard Boolean Key to Start Game
   * @return
   */
  public boolean isKeySpace(){
    return keySpace;
  }

  /**
   * Keyboard Boolean Key to Restart Game
   * @return
   */
  public boolean isKeyRestart(){
    return keyRestart;
  }

  /**
   * Keyboard Boolean Key to Mute Audio
   * @return
   */
  public boolean isKeyMute(){
    return keyMute;
  }

  /**
   * Keyboard Boolean to Fire
   * @return
   */
  public boolean isKeyFire() {
    return keyFire;
  }



}
