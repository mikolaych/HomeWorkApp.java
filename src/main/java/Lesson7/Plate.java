package Lesson7;

import java.util.Scanner;

public class Plate {
    private int food;
    private boolean sat;

    public Plate(int food) {
        this.food = food;
    }

    public void setFood(int food) {
        System.out.print("Введите количество еды в тарелке:  ");
        Scanner inputFoodInPlate = new Scanner(System.in);
        food = inputFoodInPlate.nextInt();
        this.food = food;
    }
    public void plusFood(){
        System.out.print("Сколько еды надо добавить?   ");
        Scanner plusFoodInPlate = new Scanner(System.in);
        food += plusFoodInPlate.nextInt();
        plateFoodInfo();
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int appetite, boolean satiety, String name){
        if ((food - appetite) >= 0 && !satiety) {
            System.out.println("Кот " + name + " съел " + appetite + " единиц еды");
            food -=  appetite;
            sat = true;
        } else if ((food - appetite) < 0){
            System.out.println("Не хватает еды в тарелке! Кошак останется голодным!");
            System.out.print("Хотите наполнить тарелку? y/n:  ");
            Scanner addFood = new Scanner(System.in);
            String addFoodInPlate = addFood.nextLine();
            if (addFoodInPlate.equals("y")){
                plusFood();
                System.out.println("Кот " + name + " съел " + appetite + " единиц еды");
                food -= appetite;
                sat = true;
            } else {
                sat = false;
            }

        } else if (satiety){
            sat = true;

        }

    }
    public void  catInfo(Cat s){
        s.catInfo(sat);

    }

    public void plateFoodInfo(){
        System.out.println("Количество еды в тарелке: " + food + " единиц");
    }
}
