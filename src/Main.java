import Game.Game;

public class Main {

    public static void main(String[] args) {

//        Response resp = Response.OK;
//
//        System.out.println(resp);

        Game game = new Game();
        game.start();
    }
}

//class Game{
//    void start(){
//        LevelFactory factory = new LevelFactory();
//        Level level = factory.create("easy");
//        level.create();
//
//        System.out.println("Start game.");
//    }
//}

//abstract class Level{
//    abstract void create();
//}
//
//class Easy extends Level{
//
//    @Override
//    public void create() {
//        System.out.println("Created Easy level.");
//    }
//}
//
//class Hard extends Level{
//
//    @Override
//    public void create() {
//        System.out.println("Created Hard level");
//    }
//}
//
//class LevelFactory{
//    public Level create(String level){
//        switch (level){
//            case "easy":
//                return new Easy();
//            case "hard":
//                return new Hard();
//            default:
//                return null;
//        }
//    }
//}

