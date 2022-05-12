package Lesson7;

import java.util.Scanner;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void setName(String name) {
        System.out.print("Введите имя кота:  ");
        Scanner inputName = new Scanner(System.in);
        name = inputName.nextLine();
        this.name = name;
    }

    public void setAppetite(int appetite) {
        System.out.print("Введите аппетит кота:  ");
        Scanner inputAppetite = new Scanner(System.in);
        appetite = inputAppetite.nextInt();
        this.appetite = appetite;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate d){
        System.out.println("Кот " + this.name + " съедает " + this.appetite + " единиц еды");
        d.decreaseFood(appetite);



    }

}
