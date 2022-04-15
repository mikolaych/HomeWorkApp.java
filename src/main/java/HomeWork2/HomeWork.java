package HomeWork2;

import java.util.Arrays;

public class HomeWork<array> {
    public static void main(String[] args) {
//        ArrayChange();
//        ArrayLoad();
//        ArraySixOnTwo();
        ArraySqare();

    }
    private static void ArrayChange() {
        int array [] = {1, 0, 1, 0, 1, 1, 1, 0, 0, 1};
        for (int i = 0; i < 10; i++) {
           if (array[i] == 1) {
               array[i] = 0;
           }  else {
               array[i] = 1;
           }

        }
        System.out.println(Arrays.toString(array));
    }
       private static void ArrayLoad() {
        int[] array = new int [8];
        int i = 0;
        do {
            array[i] = 3 * i;
            i++;
        } while (i < 8);


           System.out.println(Arrays.toString(array));
    }
    private static void ArraySixOnTwo() {
        int array [] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 6;
            }
        }

        System.out.println(Arrays.toString(array));
    }
    private static void ArraySqare() {
        int [] [] table = new int [10] [10];
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

}
