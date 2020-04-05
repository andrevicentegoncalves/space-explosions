package bellosqueues.spaceexplosions.services;

import bellosqueues.spaceexplosions.services.utilities.Direction;

public class GameEngineService {

  private PlayerService player;


  /**
   * Keyboard Boolean Properties
   */
  private boolean keySpace;
  private boolean keyRestart;
  private boolean keyMute;
  private boolean keyFire;


  /**
   * Game Initialization
   */
  public void init(){

    // StartMenu

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
