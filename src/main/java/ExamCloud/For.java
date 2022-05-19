package ExamCloud;

public class For {
    static char[] word = {'h','e','l','l','o'};
    public static void main(String[] args) {
        Operation.operation();

    }
    private static class Operation{
        public static void operation(){
            for (char c : word) {
                System.out.print(c);
            }
        }
    }
}
