package tictactoemy;

import java.util.Random;
import java.util.Scanner;

public class GameLogic extends Field {
    static boolean isGameEnds(char[][] field) {

        if(whoWon(field, 'X')) {
            printField(field);
            System.out.println("Игрок 1 выиграл!");
            return true;
        }

        if(whoWon(field, 'O')) {
            printField(field);
            System.out.println("Игрок 2 выиграл!");
            return true;
        }

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] == ' ') {
                    return false;
                }
            }

        }
        printField(field);
        System.out.println("Ничья!");
        return true;
    }
    private static boolean whoWon(char[][] field, char symbol) {
        if ((field[0][0] == symbol && field[0][1] == symbol && field[0][2] == symbol) ||
                (field[1][0] == symbol && field[1][1] == symbol && field[1][2] == symbol) ||
                (field[2][0] == symbol && field[2][1] == symbol && field[2][2] == symbol)||

                (field[0][0] == symbol && field[1][0] == symbol && field[2][0] == symbol) ||
                (field[0][1] == symbol && field[1][1] == symbol && field[2][1] == symbol) ||
                (field[0][2] == symbol && field[1][2] == symbol && field[2][2] == symbol)||

                (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol) ||
                (field[0][2] == symbol && field[1][1] == symbol && field[2][0] == symbol) ){
            return true;
        }
        return false;
    }

    static void computerTurn(char[][] field) {
        Random rand = new Random();
        int computerTurn;
        while(true) {
            computerTurn = rand.nextInt(9) + 1;
            if(isValidTurn(field, Integer.toString(computerTurn))) {
                break;
            }
        }
        System.out.println("Компьютер выбрал клетку: " + computerTurn);
        placeTurn(field, Integer.toString(computerTurn), 'O');
    }
    private static boolean isValidTurn(char[][] field, String cell) {
        switch (cell){
            case "1":
                return (field[0][0] == ' ');
            case "2":
                return (field[0][1] == ' ');
            case "3":
                return (field[0][2] == ' ');
            case "4":
                return (field[1][0] == ' ');
            case "5":
                return (field[1][1] == ' ');
            case "6":
                return (field[1][2] == ' ');
            case "7":
                return (field[2][0] == ' ');
            case "8":
                return (field[2][1] == ' ');
            case "9":
                return (field[2][2] == ' ');
            default:
                return false;
        }
    }
    static void playerTurn(char[][] field, Scanner scanner) {
        String userInput;
        while(true) {
            System.out.println("Выберите ячейку 1-9");
            userInput = scanner.nextLine();
            if (isValidTurn(field,userInput)) {
                break;
            } else {
                System.out.println("Выберите другую ячейку");
            }
        }
        placeTurn(field, userInput, 'X');
    }
    private static void placeTurn(char[][] field, String cell,char symbol) {
        switch (cell){
            case "1":
                field[0][0] = symbol;
                break;
            case "2":
                field[0][1] = symbol;
                break;
            case "3":
                field[0][2] = symbol;
                break;
            case "4":
                field[1][0] = symbol;
                break;
            case "5":
                field[1][1] = symbol;
                break;
            case "6":
                field[1][2] = symbol;
                break;
            case "7":
                field[2][0] = symbol;
                break;
            case "8":
                field[2][1] = symbol;
                break;
            case "9":
                field[2][2] = symbol;
                break;
            default:
                System.out.println("Выберите другую ячейку");
        }
    }


}
