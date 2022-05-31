package HomeWork10_1;

import java.util.Scanner;

public class Box<T extends Fruit> {

    private T object;
    private int counter;

    public Box(T obj, int fruitCount) {
        this.object = obj;
        this.counter = fruitCount;
    }

    public T getObj() {
        return object;
    }

    public void setObj(T obj) {
        this.object = obj;
    }

    public void addFruit(int num) {
        counter += num;
    }

    float getWeight() {
        return counter * object.getWeight();

    }

    public boolean compare(Box<?> box) {
        if (this.getWeight() == box.getWeight()) {
            System.out.println("Ящики равны");
            return true;
        } else {
            System.out.println("Ящики не равны");
            return false;
        }


    }

}
