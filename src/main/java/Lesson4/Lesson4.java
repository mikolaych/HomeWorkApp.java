package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        System.out.println("Кто такой Миша?");
        Random random = new Random();
        int a  = random.nextInt(0, 100);
        int b  = random.nextInt(0, 100);
        int c = a * b;
        System.out.print(a + " * " + b + " =");
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        if (c == d) {
            System.out.println("Миша - уебан!");
        } else {
            System.out.println("Ты как Миша - уебан! Вали учиться в школу!");
        }
    }
}
