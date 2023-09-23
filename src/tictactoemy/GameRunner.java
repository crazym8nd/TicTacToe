package tictactoemy;

import java.util.Scanner;

import static tictactoemy.Field.printFieldDemo;


public class GameRunner {

    public static void main(String[] args) {


        System.out.println("Вы запустили игру крестики-нолики!");
        System.out.println("Для того, чтобы начать введите 1");
        System.out.println("Для того, чтобы узнать правила введите 2");
        System.out.println("Для того,чтобы выйти из игры введите 0");

        boolean correctchoice = false;
        try (Scanner menu = new Scanner(System.in)) {
            String choice = menu.nextLine();
            do{
                switch (choice) {
                case "1":
                    gameStart();
                    correctchoice = true;
                    break;
                case "2":
                    correctchoice = true;
                    System.out.println("Перед вами игровое поле, помеченное цифрами, при воде сосответсвующей цифры - вы поставите свою фигуру в соответствующей клетке.");
                    printFieldDemo();
                    System.out.println("Для того,чтобы выиграть необходимо поставить 3 одинаковых фигуры в любом направлении!");
                    System.out.println("Желаю удачи!");
                    System.out.println("Начать новую игру? Введите 1 - да, 0 - нет");
                    choice = menu.nextLine();
                    switch (choice) {
                        case "1":
                            gameStart();
                            break;
                        case "0":
                            System.exit(0);
                        default:
                            System.out.println("Вы кот!");
                    }
                    break;
                case "0":
                    correctchoice = true;
                    System.exit(0);
                default:
                    System.out.println("Выберите пункт меню!");
                    choice = menu.nextLine();
            }
            } while (!correctchoice);

            }


        }

    private static void gameStart () {
        Scanner scanner = new Scanner(System.in);
        GameLogic newgame = new GameLogic();

        newgame.printField(newgame.getField());

        while (true) {
            newgame.playerTurn(newgame.getField(), scanner);
            if (newgame.isGameEnds(newgame.getField())) {
                break;
            }
            ;
            newgame.printField(newgame.getField());
            newgame.computerTurn(newgame.getField());
            if (newgame.isGameEnds(newgame.getField())) {
                break;
            }
            ;
            newgame.printField(newgame.getField());
        }

    }
}














