package bellosqueues.spacexplosions.services;

import bellosqueues.spacexplosions.persistence.model.Player;
import bellosqueues.spacexplosions.persistence.model.position.SimpleGfxPosition;
import bellosqueues.spacexplosions.utilities.Directions;
import bellosqueues.spacexplosions.utilities.PicturePaths;

public class PlayerService {

  private Player player;

  public void movePlayer(Directions direction){
      player.move(direction);
  }

  /*
   TODO
   make player explode
   change player score
  */


  /**
   *
   * @return Getters e Setters
   */

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }
}
