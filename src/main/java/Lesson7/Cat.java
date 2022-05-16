package Lesson7;

import java.util.Scanner;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public void setAppetite(int appetite) {
        System.out.print("Введите аппетит кота " + name + ":  ");
        Scanner inputAppetite = new Scanner(System.in);
        appetite = inputAppetite.nextInt();
        this.appetite = appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate d){
        d.decreaseFood(appetite, satiety, name);

    }
    public void catInfo(boolean sat){
        if (sat){
            System.out.println("Кот " + name + " сыт" );
            setSatiety(true);
        } else {
            System.out.println("Кот " + name + " голодный");
        }

    }

}
