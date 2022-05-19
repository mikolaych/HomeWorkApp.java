package ExamCloud;

import java.util.Scanner;

public class ChetNechet {
    public static void main(String[] args) {
        int weekDay;
        System.out.print("Введите число от 1 до 7:  ");
        Scanner weekDay1 = new Scanner(System.in);
        weekDay = weekDay1.nextInt();
        switch (weekDay) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Ошибка");
        }

    }

}
