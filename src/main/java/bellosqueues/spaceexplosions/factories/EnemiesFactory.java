package bellosqueues.spaceexplosions.factories;

import bellosqueues.spaceexplosions.persistence.model.enemies.Asteroid;
import bellosqueues.spaceexplosions.persistence.model.enemies.Enemy;
import bellosqueues.spaceexplosions.persistence.model.enemies.Obstacles;
import bellosqueues.spaceexplosions.persistence.model.enemies.ObstaclesTypes;

public class EnemiesFactory<T> {

    public Obstacles displayEnemies(ObstaclesTypes obstaclesTypes){

        switch (obstaclesTypes) {
            case ENEMY:
                return new Enemy();

            case ASTEROID:
                return new Asteroid((int)Math.random()*500,(int)Math.random()*500);

        }

        return null;
    }
}
