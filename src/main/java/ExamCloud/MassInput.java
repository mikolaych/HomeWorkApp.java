package ExamCloud;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class MassInput {
    static Double[] mass = new Double[4];
    public static void main(String[] args) {
        ArrayInput.arrayInput();

    }
    private static class ArrayInput{
        public static void arrayInput() {
            for (int i = 0; i < mass.length; i++) {
                ThreadLocalRandom massInput = ThreadLocalRandom.current();
                double a = massInput.nextDouble(-50, 50);
                mass[i] = a;
            }
            System.out.println(Arrays.toString(mass));
        }
    }
}
