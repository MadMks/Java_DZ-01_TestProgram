package Game;

import Level.*;

import java.util.Scanner;

public class Game {

    private LevelFactory factory = null;
    private Level level = null;
    private Difficulty difficulty = null;

    public Game(){
        factory = new LevelFactory();
    }

    // Запуск игры.
    public void start(){

        showMenu();

        level = factory.create(difficulty);

        if (level != null){
            level.start();
        }
    }

    // Вывод меню.
    private void showMenu(){

        int codeLevel = 0;
        boolean isLevelExists = false;

        do {
            showBody();
            codeLevel = getUserValue();
            isLevelExists = Difficulty.isExists(codeLevel);
            System.out.println();

            if (!isLevelExists) { showErrorLevel(); }

        } while (!isLevelExists);

        difficulty = Difficulty.getDifficulty(codeLevel);
    }

    // Вывод тела меню.
    private void showBody() {
        System.out.println("\nВыберите уровень сложности:");

        System.out.println("1 - Easy");
        System.out.println("2 - Hard");

        System.out.print("Введите число (1 или 2): ");
    }

    // Получение выбора пользователя.
    private int getUserValue(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    // Вывод сообщения об ошибке.
    private void showErrorLevel(){
        System.out.println(" [error] Вы ввели неправильный уровень!");
//        System.out.println();
    }
}
