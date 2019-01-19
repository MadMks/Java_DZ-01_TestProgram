package Level;

public class LevelFactory {
    public Level create(String level){
        switch (level){
            case "easy":
                return new Easy();
            case "hard":
                return new Hard();
            default:
                return null;
        }
    }
}
