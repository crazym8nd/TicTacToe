package ticatactoejohn;

public class Fieldjohn {
    public char[][] field = new char[][]{{' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}};

    public void printField() {
        System.out.println(field[0][0] + " | " + field[0][1] + " | " + field[0][2]);
        System.out.println("--+---+--");
        System.out.println(field[1][0] + " | " + field[1][1] + " | " + field[1][2]);
        System.out.println("--+---+--");
        System.out.println(field[2][0] + " | " + field[2][1] + " | " + field[2][2]);
    }
}
