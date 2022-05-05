package Lesson6HW;

public class MainClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog("", 500, 10);
        Cat cat1 = new Cat("", 200, 10);
        Dog dog2 = new Dog("Sharik", 500, 10);
        Cat cat2 = new Cat("", 200, 10);
        cat1.setAnimalName("Vasiliy");
        cat1.setDistanceToRun(100);
        cat1.setDistanceToSwim(5);
        cat1.animalInfoToPrint();
        dog1.setAnimalName("Grey");
        dog1.setDistanceToRun(1400);
        dog1.setDistanceToSwim(8);
        dog1.animalInfoToPrint();
        cat2.setAnimalName("Kokos");
        cat2.setDistanceToRun(100);
        cat2.setDistanceToSwim(5);
        cat2.animalInfoToPrint();
        dog2.setDistanceToRun(400);
        dog2.setDistanceToSwim(20);
        dog2.animalInfoToPrint();


    }

}
