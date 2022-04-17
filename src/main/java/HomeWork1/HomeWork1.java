package HomeWork1;
import java.util.Scanner;
public class HomeWork1 {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

            //     Из методички:

        exercise3(); //a * (b + (c / d))
        exercise4(); //от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
        exercise5(); //напечатать в консоль, положительное ли число передали или отрицательное
        exercise6(); //вернуть true, если число отрицательное, и вернуть false если положительное
        exercise7(); //вывести в консоль сообщение «Привет, указанное_имя!»
        exercise8(); //метод, который определяет, является ли год високосным

    }

    /*Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.*/
    private static void printTreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //  Не примите за понты, просто пробую организовать ввод с консоли при помощи утилиты Scanner, как было в рекомендованном курсе.

    /*Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;*/
    private static void checkSumSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a:");
        int a = scanner.nextInt();
        System.out.println("Введите число b:");
        int b = scanner.nextInt();
        if ((a + b) >= 0) {
            System.out.println("Сумма положительная!");
        } else {
            System.out.println("Сумма отрицательная!");
        }
    }

    /*Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;*/
    private static void printColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите value:");
        int value = scanner.nextInt();
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value < 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    /*Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b”;*/
    private static void compareNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a:");
        int a = scanner.nextInt();
        System.out.println("Введите b:");
        int b = scanner.nextInt();
        if ( a >= b) {
            System.out.println(a + ">=" + b);
        } else {
            System.out.println(a + "<" + b);
        }
    }


                            //    Из методички

    /*Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
где a, b, c, d – аргументы этого метода, имеющие тип float. */
    private static void exercise3() {
        float a = 10;
        float b = 20;
        float c = 54;
        float d = 90;
        System.out.println("Результат: " + (a*(b+(c/d))));
    }

    /*Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.*/
    private  static boolean exercise4() {
        int a = 15;
        int b = 60;
        if (((a + b) >= 10) && ((a + b) <=20)) {
            return true;
        } else {
            return false;
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
    считаем положительным числом.*/
    private static void exercise5() {
        int a = -8;
        if (a >= 0) {
            System.out.println("Число " + a + " положительное");

        } else {
            System.out.println("Число " + a + " отрицательное");
        }
    }

    /*Написать метод, которому в качестве параметра передается целое число. Метод должен
    вернуть true, если число отрицательное, и вернуть false если положительное.*/
    private static boolean exercise6() {
        int a = 4;
        if (a<0){
            return (true);
        } else {
            return (false);
        }

    }

    /*Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».*/
    private static void exercise7() {
        String name = "Саня";
        System.out.println("Привет, " + name + "!");
    }

    /*Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    високосный*/
    private static void exercise8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int year = scanner.nextInt();
        if ((((year%4) == 0) && (year%100!=0)) || (year%400 == 0)) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год не високосный");
        }

    }

}
