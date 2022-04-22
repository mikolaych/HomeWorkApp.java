package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static final String SPACE = "  ";
    static int SIZE;
    static int NUMBER_OF_CHIP;

    final static char DOT_EMPTY = '.';
    final static char DOT_HUMAN = 'X';
    final static char DOT_AI = '0';
    static char[][] field = new char[SIZE][SIZE];


    public static void main(String[] args) {
        inputConditions();
        drawField();
        humanMove();
//        aiMove();

    }



    private static void inputConditions() {
        Scanner scanner = null;
        while (SIZE <= 2) {
            System.out.print("Введите размер игрового поля: ");
            scanner = new Scanner(System.in);
            SIZE = scanner.nextInt();
            if (SIZE <= 2) {
                System.out.println("Поле не может быть меньше 3-х");
            }
        }

        while (NUMBER_OF_CHIP <= 2) {
            System.out.print("Введите количество фишек для выигрыша: ");
            scanner = new Scanner(System.in);
            NUMBER_OF_CHIP = scanner.nextInt();
            if (NUMBER_OF_CHIP <= 2){
                System.out.println("Количество фишек не может быть меньше 3-х");
            }
        }

    }

    private static void drawField() {

        System.out.print(SPACE + " ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + SPACE);
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + SPACE);
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
                System.out.print(field[i][j] + SPACE);
            }
            System.out.println();
        }

    }
    private static void humanMove() {
        System.out.print("Введите номер строки: ");
        Scanner scanner = new Scanner(System.in);
        int rowHuman = scanner.nextInt() - 1;
        System.out.print("Введите номер столбца: ");
        Scanner scanner1 = new Scanner(System.in);
        int columnHuman = scanner1.nextInt() - 1;
        field[rowHuman][columnHuman] = DOT_HUMAN ;



    }


}
