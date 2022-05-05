package Lesson6HW;

public class Cat extends Animals {

    public Cat(String animalName, int maxDistanceToRun, int maxDistanceToSwim) {
        super(animalName, maxDistanceToRun, maxDistanceToSwim, 0, 0);
    }


    @Override
    public boolean swim() {
        System.out.println(getAnimalName() + " can't swim");
        return false;

    }



}
