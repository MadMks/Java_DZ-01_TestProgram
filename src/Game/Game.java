package Game;

import Level.*;

public class Game {

    private LevelFactory factory = null;
    private Level level = null;
    private Difficulty difficulty = null;

    public Game(){
        factory = new LevelFactory();
        difficulty = Difficulty.Easy;
    }

    public Game(Difficulty difficulty){
        factory = new LevelFactory();
        this.difficulty = difficulty;
    }

    public void start(){
        level = factory.create(difficulty);

        if (level != null){
            level.start();
        }
    }
}
