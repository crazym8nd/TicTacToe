package game;

import java.util.Scanner;

public class GameLogic extends Field {
    Field newgame = new Field();
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
        for (int i = 0; i < 8; i++) {
            System.out.println("Выберите клетку: 1 - 9 или введите 0 для выхода");
            printField();
            Scanner turn = new Scanner(System.in);
            switch (turn.nextInt()) {
                case 1:
                    field[0][0] = player1;
                    break;
                case 2:
                    field[0][1] = player1;
                    break;
                case 3:
                    field[0][2] = player1;
                    break;
                case 4:
                    field[1][0] = player1;
                    break;
                case 5:
                    field[1][1] = player1;
                    break;
                case 6:
                    field[1][2] = player1;
                    break;
                case 7:
                    field[2][0] = player1;
                    break;
                case 8:
                    field[2][1] = player1;
                    break;
                case 9:
                    field[2][2] = player1;
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Вы ввели неверный номер клетки!");
            }
        }
    }
    public String checkWin() {
        if (player1 == 'X') {
            if (((field[0][0] == player1 && field[0][1] == player1 && field[0][2] == player1) | (field[1][0] == 'X' && field[1][1] == 'X' && field[1][2] == 'X') | (field[2][0] == 'X' && field[2][1] == 'X' && field[2][2] == 'X') | (field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X')) |
                    ((field[0][0] == 'X' && field[1][0] == 'X' && field[2][0] == 'X') | (field[0][1] == 'X' && field[1][1] == 'X' && field[2][1] == 'X') | (field[0][2] == 'X' && field[1][2] == 'X' && field[2][2] == 'X')) |
                    ((field[0][0] == 'X' && field[1][1] == 'X' && field[2][2] == 'X') | (field[0][2] == 'X' && field[1][1] == 'X' && field[2][0] == 'X'))) {
                return ("Победа игрока 1!");
            } else {
                return ("111111");
            }
        }else return ("2222");
    }
}


