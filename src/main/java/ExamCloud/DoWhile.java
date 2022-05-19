package ExamCloud;


public class DoWhile {
    static int i = 0;
    public static void main(String[] args) {
       DoWhileOperation.operation();
    }
    private static class DoWhileOperation{
        public static void operation(){
            do {
                i++;
                if (i%5 == 0){
                    System.out.println(i);
                }
            } while (i<=100);
        }

    }
}

