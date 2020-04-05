package bellosqueues.spaceexplosions.factories;

import bellosqueues.spaceexplosions.Asteroid;
import bellosqueues.spaceexplosions.model.Enemy;
import bellosqueues.spaceexplosions.model.Obstacles;
import bellosqueues.spaceexplosions.model.ObstaclesTypes;

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
