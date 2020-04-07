package bellosqueues.spacexplosions.factories;

import bellosqueues.spacexplosions.persistence.model.enemies.Asteroid;
import bellosqueues.spacexplosions.persistence.model.enemies.Enemy;
import bellosqueues.spacexplosions.persistence.model.enemies.Obstacles;
import bellosqueues.spacexplosions.persistence.model.enemies.ObstaclesTypes;
import bellosqueues.spacexplosions.persistence.model.position.LogicPosition;
import bellosqueues.spacexplosions.persistence.model.position.Position;

public class EnemiesFactory<T> {

    LogicPosition position;

    public static Obstacles createObstacle(ObstaclesTypes obstaclesTypes, Position position){

        switch (obstaclesTypes) {
            case ENEMY:
                return new Enemy();

            case ASTEROID:
                return new Asteroid();

        }

        return null;
    }
}
