package game;

import java.util.Scanner;

import static game.Field.printFieldDemo;

public class GameRunner {
    public static void main(String[] args) {
        System.out.println("Вы запустили игру крестики-нолики!");
        System.out.println("Для того,чтобы начать играть введите 1");
        System.out.println("Для того,чтобы узнать правила введите 2");
        System.out.println("Для того,чтобы выйти из игры введите 0");
        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();
        switch (choice){
            case 1:
                GameLogic newgame = new GameLogic();
                newgame.chooseFigure();
                System.out.println(newgame.checkWin());
                newgame.turns();
                System.out.println(newgame.checkWin());


                break;


            case 2:
                System.out.println("Перед вами игровое поле, помеченное цифрами, при воде сосответсвующей цифры - вы поставите свою фигуру в соответствующей клетке.");
                System.out.println("Для того чтобы выиграть, вам нужно получить ряд из трех одинаковых фигур в любом направлении!");
                printFieldDemo();
                System.out.println("Желаю удачи!");
                System.out.println("Хотите начать игру? Введите 1 - если да, 0 - если нет,");
                choice = menu.nextInt();
                 break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Выберите пункт меню!");
        }
    }
}
