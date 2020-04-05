package bellosqueues.spaceexplosions.services;

import bellosqueues.spaceexplosions.persistence.model.Player;
import bellosqueues.spaceexplosions.services.utilities.Direction;

public class PlayerService {

  private Player player;

  public void movePlayer(Direction direction){
      player.move(direction);
  }

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
