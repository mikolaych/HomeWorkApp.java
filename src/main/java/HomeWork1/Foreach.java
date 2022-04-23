package HomeWork1;

public class Foreach {
    public static void main(String[] args) {
      //  StringSm();
        Incoming();
    }
    private static void StringSm() {
        String[] sm = {"A", "B", "C", "D", "E"};
        for (String o : sm ) {
            System.out.println(o + "");
        }

    }
    private static void Incoming() {
                   for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(" " + i + j);
                }
            }
        }
}
