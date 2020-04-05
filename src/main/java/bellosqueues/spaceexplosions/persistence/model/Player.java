package bellosqueues.spaceexplosions.persistence.model;

/**
 * Our spaceship
 */
public class Player extends AbstractModel{

  private int hitPoints;

  public int getHitPoints() {
    return hitPoints;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

}
