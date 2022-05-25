package HomeWork9;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String[][] array = new String[][]{{"1","2","3","4"}, {"0","0","7","8"}, {"6","2","9","6"},  {"0","0","0","0"}};
        try {
            massPrint(array);
        } catch (MyArraySizeException e) {
            System.out.println("Коротка кольчужка, размерчик не тот. Давай заново!");
        }
        try {
            int rez = massCalc(array);
            System.out.println("Сумма элементов массива:" + rez);
        } catch (MyArrayDataException e) {
            System.out.println("В массиве отнюдь не числа");
            System.out.println("Косяк здесь: " + "строка " + (e.i+1) + " , столбец " + (e.j+1));
        }
    }
    public static void massPrint(String[][] arr) throws MyArraySizeException{
        System.out.println("Массивчик:");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("");
            }
            for (int j = 0; j < arr.length; j++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException("");
                }
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int massCalc(String[][] arr) throws MyArrayDataException {
        int rez = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    rez = rez + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }

        }
        return rez;
    }
}