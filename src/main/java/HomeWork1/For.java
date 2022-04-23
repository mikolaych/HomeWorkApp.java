package HomeWork1;

public class For {
    public static void main(String[] args) {
      //  ForMethod();
        ManyForMethod();
    }
       private static void ForMethod() {
        for (int i = 0; i<10; i++){
            System.out.println("i = " + i);
        }
    }
    private static void ManyForMethod() {
        for (int i = 10,  j = 0; i > j; i--, j++) {
            System.out.println("rezult 1 - " + i + "  Rezult 2 - " + j);
        }
    }

}
