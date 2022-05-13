package Lesson7;

public class MainClass {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик", 10);
        Plate plate = new Plate(30);
        plate.setFood(plate.getFood());
        cat1.setAppetite(cat1.getAppetite());
        plate.plateFoodInfo();
        cat1.eat(plate);
        plate.plateFoodInfo();


    }
}
