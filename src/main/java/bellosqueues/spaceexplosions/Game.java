package bellosqueues.spaceexplosions;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Game {

    public static void main(String[] args) {

        Picture background = new Picture(10,10, "space_arena.png");
        background.draw();


        Picture ship = new Picture(50,200, "ship.png");
        ship.draw();

        Asteroid ast1 = new Asteroid(300, 200);
        Asteroid ast2 = new Asteroid(500, 300);
        Asteroid ast3 = new Asteroid(400, 100);

    }

}
