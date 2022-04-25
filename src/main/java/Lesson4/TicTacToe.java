package Lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static final String SPACE = "  ";
    static int SIZE;
    static int NUMBER_OF_CHIP;
    final static char DOT_EMPTY = '.';
    final static char DOT_HUMAN = 'X';
    final static char DOT_AI = 'O';
    public static char[][] field = new char[SIZE][SIZE];
    public static int W;

    public static void main(String[] args) {
        inputConditions();
        field = new char[SIZE][SIZE];
        initialField();

        int b = 0;
        drawField();
        while ( W != 12 || W !=13 || W !=14){

        humanMove();
            drawField();
            if (W != 12) {
                aiMove();
                drawField();
            }
            int W;
        }
        if (W == 12){
            System.out.println("Чел победил!!!");
        } else if (W == 13){
            System.out.println("Комп победил!!!");
        } else if(W == 14){
            System.out.println("Ничья!!!");
        }

    }

    private static void inputConditions() {
        Scanner scanner = null;
        while (SIZE <= 2 || SIZE > 12) {
            System.out.print("Введите размер игрового поля: ");
            scanner = new Scanner(System.in);
            SIZE = scanner.nextInt();
            if (SIZE <= 2) {
                System.out.println("Поле не может быть меньше 3-х");
            } else if (SIZE > 12) {
                System.out.println("Поле не может быть больше 12");
            }
        }
        while (NUMBER_OF_CHIP <= 2 || (SIZE < 6 && NUMBER_OF_CHIP > 4) || NUMBER_OF_CHIP > 5) {
            System.out.print("Введите количество фишек для выигрыша: ");
            scanner = new Scanner(System.in);
            NUMBER_OF_CHIP = scanner.nextInt();
            if (NUMBER_OF_CHIP <= 2) {
                System.out.println("Количество фишек не может быть меньше 3-х");
            } else if (SIZE < 6 && NUMBER_OF_CHIP > 4) {
                System.out.println("При размере поля 4-6 количество фишек не больше 4");
            } else if (NUMBER_OF_CHIP > 5) {
                System.out.println("Количество фишек не должно превышать 5");
            }
        }
    }

    private static void initialField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = DOT_EMPTY;
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
                System.out.print(field[i][j] + SPACE);
            }
            System.out.println();
        }
    }

    private static void humanMove() {
        int rowHuman = 0;
        int columnHuman = 0;
        while (true) {
            System.out.print("Введите номер строки: ");
            Scanner scanner = new Scanner(System.in);
            rowHuman = scanner.nextInt() - 1;
            System.out.print("Введите номер столбца: ");
            Scanner scanner1 = new Scanner(System.in);
            columnHuman = scanner1.nextInt() - 1;

            if (cellFree(rowHuman, columnHuman)) {
                break;
            } else {
                System.out.println("Ячейка занята");
            }

        }
        System.out.println("Человек ходит");
        field[rowHuman][columnHuman] = DOT_HUMAN;
        chipControlHuman(rowHuman, columnHuman);
    }

    private static boolean cellFree(int rowHuman, int columnHuman) {
        return field[rowHuman][columnHuman] == DOT_EMPTY;
    }

    private static void chipControlHuman(int row, int column) {
        int a = 0;
        int b = 0;
        for (int i = row; i <= row; i++) {
            for (int j = 0; j < SIZE; j++) {
                a = a + field[i][j];
                if (field[i][j] == DOT_EMPTY || field[i][j] == DOT_AI) {
                    a = 0;
                }
                if ((NUMBER_OF_CHIP == 3 && a == 264) || (NUMBER_OF_CHIP == 4 && a == 352) || (NUMBER_OF_CHIP == 5 && a == 440)) {
                    W = 12;
                    break;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = column; j <= column; j++) {
                b = b + field[i][j];
                if (field[i][j] == DOT_EMPTY || field[i][j] == DOT_AI) {
                    b = 0;
                }
                if ((NUMBER_OF_CHIP == 3 && b == 264) || (NUMBER_OF_CHIP == 4 && b == 352) || (NUMBER_OF_CHIP == 5 && b == 440)) {
                    W = 12;
                    break;
                }

            }

        }

    }

    private static void aiMove() {
        int rowAi = 0;
        int columnAi = 0;
        System.out.println("Ход компа");
        while (true) {
            Random random = new Random();
            rowAi = random.nextInt(0, SIZE);
            Random random1 = new Random();
            columnAi = random.nextInt(0, SIZE);
            if (cellFree(rowAi, columnAi)) {
                break;
            }
        }
        field[rowAi][columnAi] = DOT_AI;
        chipControlAi(rowAi, columnAi);
    }

    private static void chipControlAi(int row, int column) {
        int a = 0;
        int b = 0;
        for (int i = row; i <= row; i++) {
            for (int j = 0; j < SIZE; j++) {
                a = a + field[i][j];
                if (field[i][j] == DOT_EMPTY || field[i][j] == DOT_HUMAN) {
                    a = 0;
                }
                if ((NUMBER_OF_CHIP == 3 && a == 375) || (NUMBER_OF_CHIP == 4 && a == 500) || (NUMBER_OF_CHIP == 5 && a == 625)) {
                    W = 13;
                    break;
                }
            }
        }

        for (int i = 0; i < SIZE; i++) {
            for (int j = column; j <= column; j++) {
                b = b + field[i][j];
                if (field[i][j] == DOT_EMPTY || field[i][j] == DOT_HUMAN) {
                    b = 0;
                }
                if ((NUMBER_OF_CHIP == 3 && b == 375) || (NUMBER_OF_CHIP == 4 && b == 500) || (NUMBER_OF_CHIP == 5 && b == 625)) {
                    W = 13;
                    break;
                }

            }

        }

    }


}