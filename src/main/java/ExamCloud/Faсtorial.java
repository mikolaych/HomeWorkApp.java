package ExamCloud;

import java.util.Scanner;

public class Faсtorial {
    static int a;
    public static void main(String[] args) {
        Input.input();
        Operation.operation();
    }
    private static class Input{
        public static void input(){
            System.out.print("Введите число:  ");
            Scanner input = new Scanner(System.in);
            a = input.nextInt();
        }
    }
    private static class Operation{
        public static void operation(){
            int b = 1;
            for (int i = 0; i < a; i++) {
                b = (i+1) * b;

            }
            System.out.println("факториал " + a + " = " + b);
        }
    }
}
