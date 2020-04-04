package bellosqueues.spaceexplosions.model;

/**
 * Common properties and methods between our 3 objects: Player(Our spaceship), Enemy(Enemy spaceships) and Obstacles(Asteroids in the beginning)
 */
public abstract class AbstractModel implements Model{

    private int positionX;
    private int positionY;
    private int speed;
    private int damage;

    /**
     * Getters and Setters
     */
    public int getPositionX() {
      return positionX;
    }

    public int getPositionY() {
      return positionY;
    }

    public int getSpeed() {
      return speed;
    }

    public int getDamage() {
      return damage;
    }

    public void setPositionX(int positionX) {
      this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
      this.positionY = positionY;
    }

    public void setSpeed(int speed) {
      this.speed = speed;
    }

    public void setDamage(int damage) {
      this.damage = damage;
    }

}
