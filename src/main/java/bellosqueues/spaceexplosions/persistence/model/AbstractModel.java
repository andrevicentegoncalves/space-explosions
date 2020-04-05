package bellosqueues.spaceexplosions.persistence.model;

import bellosqueues.spaceexplosions.persistence.model.position.AbstractPosition;
import bellosqueues.spaceexplosions.services.utilities.Direction;

/**
 * Common properties and methods between our 3 objects: Player(Our spaceship), Enemy(Enemy spaceships) and Obstacles(Asteroids in the beginning)
 */
public abstract class AbstractModel implements Model{

    private AbstractPosition position;
    private int speed;
    private int damage;

    /**
     * Getters and Setters
     */

    public AbstractPosition getPosition() {
        return position;
    }

    public void setPosition(AbstractPosition position) {
        this.position = position;
    }

    public int getPositionX() {
        return position.getCol();
    }

    public int getPositionY() {
      return position.getRow();
    }

    public int getSpeed() {
      return speed;
    }

    public int getDamage() {
      return damage;
    }

    public void setPositionX(int positionX) {
      position.setCol(positionX);
    }

    public void setPositionY(int positionY) {
      position.setRow(positionY);
    }

    public void setSpeed(int speed) {
      this.speed = speed;
    }

    public void setDamage(int damage) {
      this.damage = damage;
    }

    @Override
    public void move(Direction direction) {

    }

    @Override
    public void explode() {

    }
}
