package game;

import java.util.Scanner;

import static game.Field1.printFieldDemo;

public class GameRunner1 {
//
//        System.out.println("Вы запустили игру крестики-нолики!");
//        System.out.println("Для того,чтобы начать играть введите 1");
//        System.out.println("Для того,чтобы узнать правила введите 2");
//        System.out.println("Для того,чтобы выйти из игры введите 0");
//        try (Scanner menu = new Scanner(System.in)) {
//            int choice = menu.nextInt();
//            switch (choice) {
//                case 1:
//                    GameLogic1 newgame = new GameLogic1();
//                    newgame.chooseFigure();
//                    while (!newgame.gameEnds()) {
//                        if (newgame.checkWin().contains("победил")) System.exit(0);
//                        newgame.turns();
//                        System.out.println(newgame.checkWin());
//                        newgame.turns2();
//                        System.out.println(newgame.checkWin());
//                    }
//                    break;
//
//                case 2:
//                    System.out.println("Перед вами игровое поле, помеченное цифрами, при воде сосответсвующей цифры - вы поставите свою фигуру в соответствующей клетке.");
//                    System.out.println("Для того чтобы выиграть, вам нужно получить ряд из трех одинаковых фигур в любом направлении!");
//                    printFieldDemo();
//                    System.out.println("Желаю удачи!");
//                    System.out.println("Хотите начать игру? Введите 1 - если да, 0 - если нет,");
//                    if (menu.nextInt() == 1) {
//                        GameLogic1 newgame2 = new GameLogic1();
//                        newgame2.chooseFigure();
//                        while (!newgame2.gameEnds()) {
//                            if (newgame2.checkWin().contains("победил")) break;
//                            newgame2.turns();
//                            System.out.println(newgame2.checkWin());
//                            while (!newgame2.gameEnds()) {
//                                if (newgame2.checkWin().contains("победил")) break;
//                                newgame2.turns2();
//                                System.out.println(newgame2.checkWin());
//                            }
//                        }
//                        break;
//                    }
//
//                case 0:
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("Выберите пункт меню!");
//            }
//
//    }
}
