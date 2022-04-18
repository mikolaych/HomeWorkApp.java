package HomeWork2;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class HomeWork2<array> {
    public static void main(String[] args) {
//        ArrayChange();
//        ArrayLoad();
//        ArraySixOnTwo();
//        ArraySqare();
//        ArrayMinMax();
        ArrayDouble();
//        ArrayMove();
    }

    /*Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
            0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/

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

    /*Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
    значениями 0 3 6 9 12 15 18 21;*/


    private static void ArrayLoad() {
        int[] array = new int[8];
        int i = 0;
        do {
            array[i] = 3 * i;
            i++;
        } while (i < 8);


        System.out.println(Arrays.toString(array));
    }

   /* Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    умножить на 2;*/

    private static void ArraySixOnTwo() {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 6;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов
            одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/

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

//    Задать одномерный массив и найти в нем минимальный и максимальный элементы

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

    /*Написать метод, в который передается не пустой одномерный целочисленный массив,
     метод должен вернуть true, если в массиве есть место, в котором сумма левой и
     правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
      checkBalance([1, 1, 1, ||2, 1]) → true, граница показана символами ||,
      эти символы в массив не входя*/

    private static void ArrayDouble() {
        int array[] = new int [10];
        for (int i = 0; i < 10; i++) {
            ThreadLocalRandom random = ThreadLocalRandom.current();
            int rand = random.nextInt(0, 10);
            array[i] = rand;
        }
        System.out.println(Arrays.toString(array));

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

    /*Написать метод, которому на вход подается одномерный массив и число n (может быть
положительным, или отрицательным), при этом метод должен сместить все элементы массива
    на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться
    вспомогательными массивами*/

    private static void ArrayMove() {
        int array[] = {10,8,2,3,1,1,10,2,2,1};
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int rand = random.nextInt(-10, 10);
        int a = rand;
       int b = 0;
       System.out.println(a);
        if (a > 0) {
            for (int j = 0; j < a; j++) {
                b = array[9];
                for (int i = 8; i >= 0; i--) {
                    array[i+1] = array[i];
                }
                array[0] = b;
            }
            System.out.println("Сдвигаем массив вправо на " + a + " элемента(ов)" );
            System.out.println(Arrays.toString(array));
        } else if (a < 0) {
            for (int j = a; j < 0 ; j++) {
                b = array[0];
                for (int i = 1; i < 10 ; i++) {
                    array[i-1] = array[i];
                }
                array[9] = b;
            }
            System.out.println("Сдвигаем массив влево на " + Math.abs(a)  + " элемента(ов)" );
            System.out.println(Arrays.toString(array));
        }
    }
}



