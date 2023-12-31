package game;

public class Field1 {
    char[][] field = new char[][]{{' ', ' ', ' '},
                                  {' ', ' ', ' '},
                                  {' ', ' ', ' '}};

    public void printField() {
        System.out.println(field[0][0] + " | " + field[0][1] + " | " + field[0][2]);
        System.out.println("--+---+--");
        System.out.println(field[1][0] + " | " + field[1][1] + " | " + field[1][2]);
        System.out.println("--+---+--");
        System.out.println(field[2][0] + " | " + field[2][1] + " | " + field[2][2]);


    }
    public void setField(char[][] field){
        this.field = field;
    }

    public static void printFieldDemo(){
        System.out.println("1"+ " | " + "2"+ " | " + "3");
        System.out.println("--+---+--");
        System.out.println("4" + " | " + "5" + " | " + "6");
        System.out.println("--+---+--");
        System.out.println("7" + " | " + "8" + " | " + "9");
    }
    public boolean gameEnds() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(field[i][j] == ' ') return false;
            }

        }
        printField();
        System.out.println("Ничья!");
        return true;

    }

}
