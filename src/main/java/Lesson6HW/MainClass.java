package Lesson6HW;

public class MainClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("", "", 500, 10);
        Cat cat1 = new Cat("", "", 200);
        Dog dog2 = new Dog("", "Sharik", 500, 10);
        Cat cat2 = new Cat("", "", 200);
        cat1.setAnimalName("");
        cat1.setMaxDistanceToRun(500);
        cat1.setDistanceToRun(100);
        cat1.animalInfoToPrint();
        dog1.setAnimalName("");
        dog1.setDistanceToRun(1400);
        dog1.setMaxDistanceToSwim(20);
        dog1.setDistanceToSwim(8);
        dog1.animalInfoToPrint();
        cat2.setAnimalName("");
        cat2.setDistanceToRun(100);
        cat2.animalInfoToPrint();
        dog2.setDistanceToRun(400);
        dog2.setDistanceToSwim(20);
        dog2.animalInfoToPrint();
        Animals.countAnimalsPrint();


    }

}
