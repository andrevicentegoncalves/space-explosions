package bellosqueues.spacexplosions.persistence.model.enemies;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Asteroid extends Obstacles {

    private Picture picture;

    public Asteroid(int x, int y){
        picture = new Picture(x, y, "images/asteroids.png");
        picture.draw();
    }


}
