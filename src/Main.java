import Game.Game;
import Level.Difficulty;

public class Main {

    public static void main(String[] args) {

        Game game = new Game(Difficulty.Hard);
        game.start();
    }
}