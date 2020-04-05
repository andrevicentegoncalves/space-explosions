package bellosqueues.spaceexplosions.persistence.model.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Asteroid extends Obstacles {

    private Picture picture;

    public Asteroid(int x, int y){
        picture = new Picture(x, y,"asteroids.png");
        picture.draw();
    }


}
