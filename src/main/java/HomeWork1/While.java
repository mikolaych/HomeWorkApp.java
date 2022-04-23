package HomeWork1;

public class While {
    public static void main(String[] args) {
       // WhileExample();
        DoWhile();

    }
    private static void WhileExample() {
        int a = 20;
        while (a > 10) {
            a--;
            System.out.println(a);
        }
    }
    private static void DoWhile() {
        int a = 20;
        do {
            a--;
            System.out.println(a);
        } while (a > 10);
    }

}
