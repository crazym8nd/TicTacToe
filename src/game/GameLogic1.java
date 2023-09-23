package game;

import java.util.Scanner;

public class GameLogic1 extends Field1 {
    Field1 newgame = new Field1();
    char player1;
    char player2;

    public void chooseFigure() {
        System.out.println("Выберите  фигуру для первого игрока: 1 - крестик, 2 - нолик");
        Scanner figure = new Scanner(System.in);
        switch (figure.nextInt()) {
            case 1:
                player1 = 'X';
                player2 = 'O';
                break;
            case 2:
                player1 = 'O';
                player2 = 'X';
                break;
        }
    }

    public void turns() {
        System.out.println("Ход первого ирогка");
        System.out.println("Выберите клетку: 1 - 9 или введите 0 для выхода");
        printField();
        Scanner turn = new Scanner(System.in);
        switch (turn.nextInt()) {
            case 1:
                if (field[0][0] == ' ') field[0][0] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 2:
                if (field[0][1] == ' ') field[0][1] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 3:
                if (field[0][2] == ' ') field[0][2] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 4:
                if (field[1][0] == ' ') field[1][0] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 5:
                if (field[1][1] == ' ') field[1][1] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 6:
                if (field[1][2] == ' ') field[1][2] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 7:
                if (field[2][0] == ' ') field[2][0] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 8:
                if (field[2][1] == ' ') field[2][1] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 9:
                if (field[2][2] == ' ') field[2][2] = player1;
                else System.out.println("Выберите другую клетку!");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Вы ввели неверный номер клетки!");
        }

    }

    public void turns2() {
        System.out.println("Ход второго игрока");
        System.out.println("Выберите клетку: 1 - 9 или введите 0 для выхода");
        printField();
        Scanner turn = new Scanner(System.in);
        switch (turn.nextInt()) {
            case 1:
                if (field[0][0] == ' ') field[0][0] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 2:
                if (field[0][1] == ' ') field[0][1] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 3:
                if (field[0][2] == ' ') field[0][2] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 4:
                if (field[1][0] == ' ') field[1][0] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 5:
                if (field[1][1] == ' ') field[1][1] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 6:
                if (field[1][2] == ' ') field[1][2] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 7:
                if (field[2][0] == ' ') field[2][0] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 8:
                if (field[2][1] == ' ') field[2][1] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 9:
                if (field[2][2] == ' ') field[2][2] = player2;
                else System.out.println("Выберите другую клетку!");
                break;
            case 0:
                System.exit(0);
                break;
            default:
                System.out.println("Вы ввели неверный номер клетки!");
        }

    }


    public String checkWin() {
        switch (player1) {
            case 'X':
                if (((field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X') || (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X') || (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X') || (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X')) ||
                        ((field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X') || (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X') || (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X')) ||
                        ((field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') || (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X'))) {
                    return "Игрок 1 победил!";
                } else if (((field[0][0] == 'O' && field[0][1] == 'O' && field[0][2] == 'O') || (field[1][0] == 'O' && field[1][1] == 'O' && field[1][2] == 'O') || (field[2][0] == 'O' && field[2][1] == 'O' && field[2][2] == 'O') || (field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O')) ||
                        ((field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O') || (field[0][1] == 'O' && field[1][1] == 'O' && field[2][1] == 'O') || (field[0][2] == 'O' && field[1][2] == 'O' && field[2][2] == 'O')) ||
                        ((field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == 'O') || (field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == 'O'))) {
                    return "Игрок 2 победил!";
                }


            case 'O':
                if (((field[0][0] == 'X' && field[0][1] == 'X' && field[0][2] == 'X') || (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X') || (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X') || (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X')) ||
                        ((field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X') || (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X') || (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X')) ||
                        ((field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') || (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X'))) {
                    return "Игрок 2 победил!";
                } else if (((field[0][0] == 'O' && field[0][1] == 'O' && field[0][2] == 'O') || (field[1][0] == 'O' && field[1][1] == 'O' && field[1][2] == 'O') || (field[2][0] == 'O' && field[2][1] == 'O' && field[2][2] == 'O') || (field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O')) ||
                        ((field[0][0] == 'O' && field[1][0] == 'O' && field[2][0] == 'O') || (field[0][1] == 'O' && field[1][1] == 'O' && field[2][1] == 'O') || (field[0][2] == 'O' && field[1][2] == 'O' && field[2][2] == 'O')) ||
                        ((field[0][0] == 'O' && field[1][1] == 'O' && field[2][2] == 'O') || (field[0][2] == 'O' && field[1][1] == 'O' && field[2][0] == 'O'))) {
                    return "Игрок 1 победил!";
                }
                break;
        }
        return "  ";
    }
}




