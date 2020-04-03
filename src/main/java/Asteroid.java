import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Asteroid {

    private Picture picture;

    public Asteroid(int x, int y){
        picture = new Picture(x, y,"asteroids.png");
        picture.draw();
    }


}
