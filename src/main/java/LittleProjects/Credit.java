package LittleProjects;

//Расчет заема. Ввод числа заема. Каждый месяц -10% от остатка

import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму заема");
        int summa = scanner.nextInt();
        System.out.println("Введите количество месяцев");
        int month = scanner.nextInt();
        System.out.println("Введите ежемесячный процент");
        int percent = scanner.nextInt();
        float everyMonthPay = 0f;
        float remainder = summa;
        float b = 0f;

        for (int i = 1; i < (month +1); i++) {
            System.out.println("Месяц  " + i);
            everyMonthPay = remainder * percent / 100;
            b = b + everyMonthPay ;
            System.out.println("Требуется отдать:  " + everyMonthPay);
            remainder = summa - b;
            System.out.println("Остаток:  " + remainder);
        }

    }
}
