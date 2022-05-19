package ExamCloud;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Mass3D {
    static int[][][] mass = new int[6][6][6];
    public static void main(String[] args) {
        MassInput.massInput();
       
    }
    private static class MassInput{
        public static void massInput(){
            for (int i = 0; i < mass.length; i++) {
                for (int j = 0; j < mass.length; j++) {
                    for (int k = 0; k < mass.length; k++) {
                        ThreadLocalRandom massElement = ThreadLocalRandom.current();
                        int a = massElement.nextInt(0, 10);
                        mass[i][j][k] = a;
                    }
                    System.out.println(Arrays.toString(mass[i][j]));
                }
            }
        }
    }
}
