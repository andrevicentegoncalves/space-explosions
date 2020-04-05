package bellosqueues.spaceexplosions.views.utilities;

import bellosqueues.spaceexplosions.services.GameEngineService;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import bellosqueues.spaceexplosions.services.utilities.Direction;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardController implements KeyboardHandler {

  private GameEngineService game;

  KeyboardController(GameEngineService game){
    this.game = game;
    listenerInit();
  }

  public void listenerInit(){

    KeyboardEvent[] events = new KeyboardEvent[8];

    for (int i = 0; i < events.length; i++) {
      events[i] = new KeyboardEvent();
    }

    events[0].setKey(KeyboardEvent.KEY_UP);
    events[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[1].setKey(KeyboardEvent.KEY_DOWN);
    events[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[2].setKey(KeyboardEvent.KEY_LEFT);
    events[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[3].setKey(KeyboardEvent.KEY_RIGHT);
    events[3].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[4].setKey(KeyboardEvent.KEY_SPACE);
    events[4].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[5].setKey(KeyboardEvent.KEY_R);
    events[5].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[6].setKey(KeyboardEvent.KEY_M);
    events[6].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[7].setKey(KeyboardEvent.KEY_Q);
    events[7].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[8].setKey(KeyboardEvent.KEY_F);
    events[8].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    Keyboard kb = new Keyboard(this);

    for (KeyboardEvent event : events) {
      kb.addEventListener(event);
    }
  }

  @Override
  public void keyPressed(KeyboardEvent event) {

    switch (event.getKey()){
      // MOVE UP
      case KeyboardEvent.KEY_UP:
        game.move(Direction.UP);

        break;

      // MOVE DOWN
      case KeyboardEvent.KEY_DOWN:
        game.move(Direction.DOWN);

        break;

      // MOVE LEFT
      case KeyboardEvent.KEY_LEFT:
        game.move(Direction.LEFT);

        break;

      // MOVE RIGHT
      case KeyboardEvent.KEY_RIGHT:
        game.move(Direction.RIGHT);

        break;

      // START GAME
      case KeyboardEvent.KEY_SPACE:
        if(game.isKeySpace() == true) {
          //game.setStartMainMenu();
          game.start();
      }
        break;

      // RESTART GAME
      case KeyboardEvent.KEY_R:
        if(game.isKeyRestart() == true) {

        }

      // MUTE
      case KeyboardEvent.KEY_M:
        if(game.isKeyMute() == true) {

        }

      // FIRE
      case KeyboardEvent.KEY_F:
        if(game.isKeyFire() == true) {

        }

      // QUIT
      case KeyboardEvent.KEY_Q:
        System.exit(1);
        break;
    }
  }

  @Override
  public void keyReleased(KeyboardEvent keyboardEvent) {
  }

}

