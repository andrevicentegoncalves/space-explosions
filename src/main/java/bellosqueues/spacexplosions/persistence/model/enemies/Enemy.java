package bellosqueues.spacexplosions.persistence.model.enemies;

/**
 * Enemy Spaceships class
 */
public class Enemy extends Obstacles {

  private int hitPoints;

  public int getHitPoints() {
    return hitPoints;
  }

  public void setHitPoints(int hitPoints) {
    this.hitPoints = hitPoints;
  }

}
