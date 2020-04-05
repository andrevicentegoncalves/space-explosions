package bellosqueues.spacexplosions.views;

import bellosqueues.spacexplosions.services.MapService;

public class GameView {

    /*
    TODO
    background
    player && obstacles
    */
    public static void main(String[] args) {

        MapService mapService = new MapService(28,8);
        mapService.init();

    }

}
