package bellosqueues.spacexplosions.services;

import bellosqueues.spacexplosions.persistence.model.Player;
import bellosqueues.spacexplosions.utilities.Directions;

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
