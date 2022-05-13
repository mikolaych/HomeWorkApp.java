package Lesson6HW;

public class Cat extends Animals {
    public static int countOfCat;

    public Cat(String classAnimal, String animalName, int maxDistanceToRun) {
        super("Кошак", animalName, maxDistanceToRun,  0);
        countOfCat++;
    }


   /* @Override
    public boolean swim() {
        System.out.println(getAnimalName() + " - кошак и плавать нимагет");
        return false;
    }*/

    public void animalInfoToPrint() {
        if (run() == true) {
            System.out.print(getAnimalName() + " может пробежать " + getDistanceToRun() + " метра(ов) и ");
        } else {
            System.out.print(getAnimalName() + " ниасилил, устал. ");
        }
        if (swim() == true || swim() == false) {
            System.out.println(getAnimalName() + " плавать не умеет, ибо кошак!");
        }
    }
}
