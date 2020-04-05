package bellosqueues.spacexplosions;

import bellosqueues.spacexplosions.persistence.model.enemies.Asteroid;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    public static void main(String[] args) {

        Picture background = new Picture(10,10, "images/space_arena.png");
        background.draw();


        Picture ship = new Picture(50,200, "images/ship.png");
        ship.draw();

        Asteroid ast1 = new Asteroid(300, 200);
        Asteroid ast2 = new Asteroid(500, 300);
        Asteroid ast3 = new Asteroid(400, 100);

    }

}
