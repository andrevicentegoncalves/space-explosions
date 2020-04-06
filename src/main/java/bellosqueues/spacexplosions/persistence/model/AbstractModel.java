package bellosqueues.spacexplosions.persistence.model;

import bellosqueues.spacexplosions.persistence.model.position.AbstractPosition;
import bellosqueues.spacexplosions.utilities.Directions;

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
    public void move(Directions direction) {

        switch (direction) {

            case UP:
                setPositionY(-1);
                break;
            case DOWN:
                setPositionY(+1);
                break;
            case LEFT:
                setPositionX(-1);
                break;
            case RIGHT:
                setPositionX(+1);
                break;
        }

    }

    @Override
    public void explode() {

    }
}
