package bellosqueues.spacexplosions.persistence.model;

import bellosqueues.spacexplosions.persistence.model.position.Position;

/**
 * Our spaceship
 */
public class Player extends AbstractModel{

  private int hitPoints;

  /**
   * Getters and Setters
   *
   * @param position
   */
  public Player(Position position) {
    super(position);
  }

  public Player() {

  }

  public int getHitPoints() {
    return hitPoints;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }


}
