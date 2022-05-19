package ExamCloud;

import java.util.Scanner;

public class While {
    static int i = 0;
    public static void main(String[] args) {
        Operation.operation();


    }
    private static class Operation {
        public static void operation(){
            while (i<10){
                System.out.println("Task" + (i+1));
                i++;
            }
        }


    }


}
