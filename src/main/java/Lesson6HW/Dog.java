package Lesson6HW;

public class Dog extends Animals {
    public static int countOfDog;

    public Dog(String  classAnimal, String animalName, int maxDistanceToRun, int maxDistanceToSwim) {
        super("Собак", animalName, maxDistanceToRun, maxDistanceToSwim, 0, 0);
        countOfDog++;
    }




}
