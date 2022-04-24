/*
package LittleProjects;

import java.util.Random;
import java.util.Scanner;

public class PlusMinus {
    public static int SIZE;
    public static char DOTS = '.';
    public static char DOTS2 = 't';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
        inputParameters();
       char [][] ARRAY = new char[SIZE][SIZE];
        doubleArray();
        inputParameters2();
        doubleArray22();
    }
    private static void inputParameters() {
        System.out.println("Вводим размер массива");
        SIZE = sc.nextInt();
    }
    private static void doubleArray() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + i+1);
            for (int j = 0; j < SIZE; j++) {
                ARRAY[i][j] = DOTS;
                System.out.print(ARRAY[i][j]);
            }
        }
    }
    private static void inputParameters2() {
        System.out.println("Вводим размер массива");
        SIZE = sc.nextInt();
    }

    private static void doubleArray22() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(" " + i+1);
            for (int j = 0; j < SIZE; j++) {
                ARRAY[i][j] = DOTS2;
                System.out.print(ARRAY[i][j]);
            }

        }
    }

}
*/
