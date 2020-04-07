package bellosqueues.spacexplosions.controllers;

import bellosqueues.spacexplosions.services.GameEngine;
import bellosqueues.spacexplosions.services.PlayerService;
import bellosqueues.spacexplosions.views.GameView;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import bellosqueues.spacexplosions.utilities.Directions;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardController implements KeyboardHandler {

  private GameEngine game;
  private PlayerService playerService;
  private GameView gameView;

  public KeyboardController(){
    listenerInit();
  }

  public void listenerInit(){

    KeyboardEvent[] events = new KeyboardEvent[9];

    for (int i = 0; i < events.length; i++) {
      events[i] = new KeyboardEvent();
    }

    events[0].setKey(KeyboardEvent.KEY_W);
    events[0].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[1].setKey(KeyboardEvent.KEY_S);
    events[1].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[2].setKey(KeyboardEvent.KEY_A);
    events[2].setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

    events[3].setKey(KeyboardEvent.KEY_D);
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
      case KeyboardEvent.KEY_W:
        playerService.movePlayer(Directions.UP);

        break;

      // MOVE DOWN
      case KeyboardEvent.KEY_S:
        playerService.movePlayer(Directions.DOWN);

        break;

      // MOVE LEFT
      case KeyboardEvent.KEY_A:
        playerService.movePlayer(Directions.LEFT);

        break;

      // MOVE RIGHT
      case KeyboardEvent.KEY_D:
        playerService.movePlayer(Directions.RIGHT);

        break;

      // START GAME
      case KeyboardEvent.KEY_SPACE:

        break;

      // RESTART GAME
      case KeyboardEvent.KEY_R:

        break;

      // MUTE
      case KeyboardEvent.KEY_M:

        break;

      // FIRE
      case KeyboardEvent.KEY_F:

        break;

      // QUIT
      case KeyboardEvent.KEY_Q:
        System.exit(1);
        break;
    }
  }

  @Override
  public void keyReleased(KeyboardEvent keyboardEvent) {
  }

  public GameEngine getGame() {
    return game;
  }

  public void setGame(GameEngine game) {
    this.game = game;
  }

  public PlayerService getPlayerService() {
    return playerService;
  }

  public void setPlayerService(PlayerService playerService) {
    this.playerService = playerService;
  }

  public void setGameView(GameView gameView) {
    this.gameView = gameView;
  }
}

