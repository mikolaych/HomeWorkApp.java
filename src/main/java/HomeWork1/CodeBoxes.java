package HomeWork1;

public class CodeBoxes {
    public static void main(String[] args) {
        //Codebox();
        Codebox2();
    }

    private static void Codebox() {
        int w = 1, h = 2, v = 0;
        if (w < h) {                     // <- Начало кодового блока if
            v = w * h;
            System.out.println(v);

        }
    }
    public static void Codebox2() {
        int a = 5, b = 10, c = 0;
        if (a != 0) {
            System.out.println("a не равно нулю");
            c = b / a;
            System.out.print("b / a равно " + c) ;
        } else {
            System.out.println("a = 0. Делить на 0 нельзя");
        }
    }

}
