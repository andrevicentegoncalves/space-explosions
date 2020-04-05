package bellosqueues.spaceexplosions;

import bellosqueues.spaceexplosions.model.Obstacles;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Asteroid extends Obstacles {

    private Picture picture;

    public Asteroid(int x, int y){
        picture = new Picture(x, y,"asteroids.png");
        picture.draw();
    }


}
