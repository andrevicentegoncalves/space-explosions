package bellosqueues.spacexplosions.persistence.model.enemies;

import bellosqueues.spacexplosions.persistence.model.position.LogicPosition;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Asteroid extends Obstacles {

    LogicPosition position;

    public Asteroid(){};

    public Asteroid(LogicPosition position){
        this.position = position;
    }

    @Override
    public LogicPosition getPosition() {
        return position;

    }
}
