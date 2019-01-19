package Game;

import Level.*;

import java.util.Scanner;

public class Game {

    private LevelFactory factory = null;
    private Level level = null;
    private Difficulty difficulty = null;

    public Game(){
        factory = new LevelFactory();
//        difficulty = Difficulty.Easy;
    }

    public Game(Difficulty difficulty){
        factory = new LevelFactory();
//        this.difficulty = difficulty;
    }

    public void start(){

        menu();

        level = factory.create(difficulty);

        if (level != null){
            level.start();
        }
    }

    public void menu(){
        System.out.println("Выберите уровень сложности:");

        System.out.println("1 - Easy");
        System.out.println("2 - Hard");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число (1 или 2): ");
        int codeLevel = scanner.nextInt();

        System.out.println("\nВы выбрали: " + codeLevel);

//        if ()
        difficulty = Difficulty.getDifficulty(codeLevel);
    }
}
