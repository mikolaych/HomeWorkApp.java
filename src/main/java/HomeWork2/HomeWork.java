package HomeWork2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork<array> {
    public static void main(String[] args) {
//        ArrayChange();
//        ArrayLoad();
//        ArraySixOnTwo();
//        ArraySqare();
//        ArrayMinMax();
        ArrayDouble();

    }
    private static void ArrayChange() {
        int array[] = {1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < 10; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }

        }
        System.out.println(Arrays.toString(array));
    }

    private static void ArrayLoad() {
        int[] array = new int[8];
        int i = 0;
        do {
            array[i] = 3 * i;
            i++;
        } while (i < 8);


        System.out.println(Arrays.toString(array));
    }

    private static void ArraySixOnTwo() {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 6;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static void ArraySqare() {
        int[][] table = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == i || (i + j) == 9) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + "  ");

            }
            System.out.println();

        }
    }

    private static void ArrayMinMax() {
        int array[] = {-7, 12, 54, 89, 1, 54, 0, 7868, 12, -89, 5, 9, 465, 7, 36, 4, 999};
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 14; i++) {
            a = array[i];
            if (a > b) {
                b = array[i];
            } else if (a < c){
                c = array[i];
            }
        }
        System.out.println("Наибольшее число: " + b);
        System.out.println("Наименьшее число:" + c);


    }
    private static void ArrayDouble() {
        int array[] = {10,8,2,3,1,1,10,2,2,1};

        /*int array[] = new int [10];
        for (int i = 0; i < 10; i++) {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int rand = random.nextInt(0, 10);
            array[i] = rand;
        }
        System.out.println(Arrays.toString(array));*/

        int a = 0;
        int b = 0;
        boolean e = false;
        for (int i = 0; i < 10; i++) {
            a = array[i] + a;
            for (int j = 9; j > i ; j--) {
                b = array[j] + b;
            }
            if (a == b) {
                System.out.println(a + " = " + b);
                e = true;
                System.out.println(e);
            }
            b=0;
            }




        }





    }



