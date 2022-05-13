package Lesson7;

import java.util.Scanner;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        System.out.print("Введите количество еды в тарелке:  ");
        Scanner inputFoodInPlate = new Scanner(System.in);
        food = inputFoodInPlate.nextInt();
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int n){
        if ((food - n) > 0) {
            food -=  n;


        } else {
            System.out.println("Не хватает еды в тарелке! Кошак останется голодным!");
        }
    }


    public void plateFoodInfo(){
        System.out.println("Количество еды в тарелке: " + food + " единиц");
    }
}
