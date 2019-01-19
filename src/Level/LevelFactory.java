package Level;

public class LevelFactory {
    public Level create(Difficulty difficulty){
        switch (difficulty){
            case Easy:
                return new Easy();
            case Hard:
                return new Hard();
            default:
                return null;
        }
    }
}
