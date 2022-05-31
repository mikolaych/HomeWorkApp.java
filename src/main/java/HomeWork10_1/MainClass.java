package HomeWork10_1;

import HomeWork10.WrongPositionException;

import java.util.Arrays;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        exchangeArray();
        Apple apple = new Apple(1f);
        Orange orange = new Orange(1.5f);
        System.out.println("Вес яблока = " + apple.getWeight());
        System.out.println("Вес апельсина = " + orange.getWeight());
        Box<Apple> appleBox = new Box<Apple>(apple, 5);
        System.out.println("Вес ящика с яблоками = " + appleBox.getWeight());
        Box<Orange> orangeBox = new Box<Orange>(orange, 2);
        System.out.println("Вес ящика с апельсинами = " + orangeBox.getWeight());
        System.out.println(orangeBox.compare(appleBox));
    }

    private static void exchangeArray() {
        String[] Array = {"один", "два", "три", "четыре"};
        int firstNum;
        int secondNum;
        System.out.print("Первый элемен массива для замены(от 0 до " + (Array.length - 1) + "):  " );
        Scanner first = new Scanner(System.in);
        firstNum = first.nextInt();
        System.out.print("Второй элемен массива для замены(от 0 до " + (Array.length - 1) + "):  " );
        Scanner second = new Scanner(System.in);
        secondNum = second.nextInt();
        try {
            exchangeElements(Array, firstNum, secondNum);
        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
        System.out.print("Результат: " + Arrays.toString(Array));
        System.out.println();
    }
    private static void exchangeElements(Object[] array, int firstNum, int secondNum) throws WrongPositionException {
        if (firstNum < 0 || firstNum >= array.length || secondNum < 0 || secondNum >= array.length) {
            throw new WrongPositionException("Ошибка. Размер массива от 0 до " + (array.length-1));
        } else if (firstNum == secondNum) {
            throw new WrongPositionException("Ошибка. Замена элемента на самого себя");
        }
        Object a = array[firstNum];
        array[firstNum] = array[secondNum];
        array[secondNum] = a;
    }
}
