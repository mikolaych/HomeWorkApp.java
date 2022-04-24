package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeTeachers {

    public static final String SPACE = " ";
    public static final String FIRST_SYMBOL = "?";
    public static int SIZE;

    final static char DOT_EMPTY = '.';
    final static char DOT_HUMAN = 'X';
    final static char DOT_AI = 'O';

    final static char [][] MAP = new char[SIZE][SIZE];
    final static Scanner in = new Scanner(System.in);
    final static Random random = new Random();


    public static void main(String[] args) {

        System.out.print("Введите размерность поля: ");
        int SIZE = in.nextInt();


        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }

        }
        System.out.print(FIRST_SYMBOL + SPACE);
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i+1 + SPACE);

        }

    }
}
