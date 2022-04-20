package HomeWork3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
//        ArrayChange();
//        Array100();
//        Array6to2();
//        ArraySqare();
//        ArrayLen();
//        RandomNumber();
        ArrayWords();


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

   /* Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями
        1 2 3 4 5 6 7 8 … 100*/

    private static void Array100() {
        int[] array100 = new int[100];
        for (int i = 0; i < 100; i++) {
            array100[i] = i;

        }
        System.out.println(Arrays.toString(array100));

    }

    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2;*/

    private static void Array6to2() {
        int[] array6to2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (array6to2[i] < 6) {
                int i1 = array6to2[i] * 2;
                array6to2[i] = i1;
            }
        }
        System.out.println(Arrays.toString(array6to2));
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

    /*Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;*/

    private static void ArrayLen() {
        System.out.print("Input array's length  ");
        Scanner len1 = new Scanner(System.in);
        int len = len1.nextInt();
        System.out.print("Input array's cell's number  ");
        Scanner initialValue1 = new Scanner(System.in);
        int initialValue = initialValue1.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        System.out.println(Arrays.toString(array));
    }

    /*  Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3
      попытки угадать это число. При каждой попытке компьютер должен сообщить, больше ли
      указанное пользователем число, чем загаданное, или меньше. После победы или проигрыша
      выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).*/

    private static void RandomNumber() {
        Random random = new Random();
        int a = random.nextInt(0, 9);
        int e = 1;
        while (e == 1) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Input any number:");
                Scanner b = new Scanner(System.in);
                int c = b.nextInt();
                if (c > a) {
                    System.out.println("Your number is biggest ");
                } else if (c < a) {
                    System.out.println("Your number is smallest");
                } else {
                    System.out.println("You're win!!!");
                    break;
                }
            }
            System.out.println("Play again? 1 - yes / 2 - no");
            Scanner d = new Scanner(System.in);
            int f = d.nextInt();
            e = f;
        }
    }

    /*Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot",
     "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
     "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
     "pumpkin", "potato"}.
     При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
     сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
     Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.*/

    private static void ArrayWords() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot",
                "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
                "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple",
                "pumpkin", "potato"};
        String[] userWordsArray = {"#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#", "#"};
        Random random = new Random();
        int a = random.nextInt(0, 25);
        String compWord = words[a];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your word:  ");
        String userWord = scanner.nextLine();
        if (compWord == userWord) {
            System.out.println("You're win!!!");
        } else {
            System.out.println("You're wrong!!");
        }


    }
}
