package LittleProjects;

import java.util.Random;
import java.util.Scanner;

public class PlusMinus {
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '.';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char [][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();
    public static void main(String[] args) {
//        array1();
//        array2();
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Human Win!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Comp Win!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Draw!");
                break;
            }

        }
        System.out.println("Game Over!");
    }



    public static boolean checkWin(char symb) {
        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb)
            return true;
        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb)
            return true;
        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb)
            return true;
        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb)
            return true;
        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb)
            return true;
        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb)
            return true; if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb)
            return true;
        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb)
            return true;
        return false;

    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }
    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }
    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }


        private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }




   /* private static void array2() {
        int array[][] = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = j + 1;
                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static void array1() {
        int [] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
            System.out.print(array[i] + ",");
        }

    }*/

}
