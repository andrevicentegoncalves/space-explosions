package bellosqueues.spacexplosions.persistence.model.enemies;

import bellosqueues.spacexplosions.persistence.model.position.LogicPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Asteroid extends Obstacles {

    LogicPosition position;
    private Picture asteroid;

    public Asteroid(LogicPosition position){
        this.position = position;
        asteroid = new Picture(position.getCol(), position.getRow(), "src/main/resources/images/asteroids.png");
    }

    @Override
    public LogicPosition getPosition() {
        return position;

    }
}
