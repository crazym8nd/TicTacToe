package tictactoemy;

public class Field {

    public char[][] getField() {
        return field;
    }

    public char[][] field ={{' ', ' ', ' '},
              {' ', ' ', ' '},
             {' ', ' ', ' '}};

    static void printField(char[][] field) {
        System.out.println(field[0][0] + " | " + field[0][1] + " | " + field[0][2]);
        System.out.println("--+---+--");
        System.out.println(field[1][0] + " | " + field[1][1] + " | " + field[1][2]);
        System.out.println("--+---+--");
        System.out.println(field[2][0] + " | " + field[2][1] + " | " + field[2][2]);
    }
    public static void printFieldDemo(){
        System.out.println(1 + " | " + 2 + " | " + 3);
        System.out.println("--+---+--");
        System.out.println(4 + " | " + 5 + " | " + 6);
        System.out.println("--+---+--");
        System.out.println(7 + " | " + 8 + " | " + 9);

    }


}
