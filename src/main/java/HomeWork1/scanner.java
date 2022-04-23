package HomeWork1;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        insertScannerOne();
        insertScannerTwo();
        insertScannerThree();
        insertScannerFour();
    }
    private static void insertScannerOne() {
        System.out.print("Введите любое целое число от 1 до 10: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.println ("Вы ввели число " + number);
    }
    private static void insertScannerTwo() {
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int number1 = k.nextInt();//считывает первое число и присваивает значение в number1
        int number2 = k.nextInt();//считывает второе число и присваивает значение в number2
        System.out.print(number1 + number2);//выводит сумму number1 + number2
    }
    private static void insertScannerThree() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phrase1 = sc.nextLine();
        System.out.println(phrase1);
    }
    private static void insertScannerFour() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любые 2 слова или фразу: ");
        String phrase1 = sc.nextLine();
        String phrase2 = sc.nextLine();
        System.out.println(phrase1 + " " + phrase2);

    }

}
