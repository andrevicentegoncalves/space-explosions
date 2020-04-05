package bellosqueues.spacexplosions.services;

import bellosqueues.spacexplosions.views.MainMenuView;

public class GameEngineService {

  private PlayerService player;


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
      mapService.init();



  }

  /**
   * Start Game
   */
  public void start(){

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
