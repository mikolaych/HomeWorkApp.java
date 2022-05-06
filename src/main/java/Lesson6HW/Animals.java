package Lesson6HW;

import java.util.Scanner;

public class Animals {
    private String animalName;
    private final int maxDistanceToRun;
    private  int maxDistanceToSwim;
    private int distanceToRun;
    private int distanceToSwim;
    private final String classAnimal;
    public static int countAnimals;


    public Animals(String classAnimal, String animalName, int maxDistanceToRun, int maxDistanceToSwim, int distanceToRun, int distanceToSwim) {
        this.classAnimal = classAnimal;
        this.animalName = animalName;
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxDistanceToSwim = maxDistanceToSwim;
        this.distanceToRun = distanceToRun;
        this.distanceToSwim = distanceToSwim;
        countAnimals++;
    }

    public Animals(String classAnimal, String animalName, int maxDistanceToRun,  int distanceToRun) {
        this.classAnimal = classAnimal;
        this.animalName = animalName;
        this.maxDistanceToRun = maxDistanceToRun;
        this.distanceToRun = distanceToRun;
        countAnimals++;
    }


    public void setAnimalName(String animalName) {
        System.out.print("Введите имя питомца(" + classAnimal + "):  ");
        Scanner name = new Scanner(System.in);
        animalName = name.nextLine();
        this.animalName = animalName;
    }

    public void setDistanceToRun(int distanceToRun) {
        System.out.print("Введите дистанцию для бега (max " + maxDistanceToRun + "):  ");
        Scanner run = new Scanner(System.in);
        distanceToRun = run.nextInt();
        this.distanceToRun = distanceToRun;

    }

    public void setDistanceToSwim(int distanceToSwim) {
        System.out.print("Введите дистанцию для плавания (max " + maxDistanceToSwim + "):  ");
        Scanner swim = new Scanner(System.in);
        distanceToSwim = swim.nextInt();
        this.distanceToSwim = distanceToSwim;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getDistanceToRun() {
        return distanceToRun;

    }

    public int getDistanceToSwim() {
        return distanceToSwim;
    }

    public boolean run() {
        if (getDistanceToRun() > maxDistanceToRun) {
            return false;
        } else {
            return true;
        }

    }

    public boolean swim() {
        if (getDistanceToSwim() > maxDistanceToSwim) {
            return false;
        } else {
            return true;
        }
    }


    public void animalInfoToPrint() {
        if (run() == true) {
            System.out.print(animalName + " может пробежать " + getDistanceToRun() + " метра(ов) и ");
        } else {
            System.out.print(animalName + " ниасилил, устал. ");
        }
        if (swim() == true) {
            System.out.println(animalName + " проплывет " + getDistanceToSwim() + " метра(ов) легко!");
        } else {
            System.out.println(animalName + " утонул");
        }
    }

    public static void countAnimalsPrint() {
        System.out.println("Всего скотины:  " + countAnimals + " рыл(-a)");
        System.out.print("Из них:  " + Cat.countOfCat + " кошаков, ");
        System.out.println(Dog.countOfDog + " собакенов");
    }


    /*public String toString(){
        return animalName + " can run " + getDistanceToRun() + " meters" + " and can swim " + getDistanceToSwim() + " meters";
    }*/


}
