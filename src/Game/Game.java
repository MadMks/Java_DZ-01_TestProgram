package Game;

import Level.*;

public class Game {

    private LevelFactory factory = null;
    private Level level = null;

    public Game(){
        factory = new LevelFactory();
    }

    public void start(){
        level = factory.create("easy");

        level.start();
    }
}
