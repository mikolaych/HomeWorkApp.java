package Lesson7;

import java.util.concurrent.ThreadLocalRandom;

public class MainClass {
    public static void main(String[] args) {
//        Cat cat1 = new Cat("Мурзик", 10, false);
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Барсик", 0, false);
        cats[1] = new Cat("Мурзик", 0, false);
        cats[2] = new Cat("Козлик", 0, false);
        cats[3] = new Cat("Чучик", 0, false);
        Plate plate = new Plate(30);
        plate.setFood(plate.getFood());
        for (Cat cat : cats) {
            cat.setAppetite(cat.getAppetite());
            plate.plateFoodInfo();
            cat.eat(plate);
            plate.catInfo(cat);
            plate.plateFoodInfo();
        }
//        cat1.setAppetite(cat1.getAppetite());

        /*while ((plate.getFood() > 0) && (plate.getFood() >= cat1.getAppetite()) && !cat1.isSatiety()) {
            cat1.eat(plate);
        }*/



    }
}
