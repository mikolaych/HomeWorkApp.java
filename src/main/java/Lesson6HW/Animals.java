package Lesson6HW;

import java.util.Scanner;

public class Animals {
   private String animalName;
    private final int maxDistanceToRun;
    private final int maxDistanceToSwim;
    private int distanceToRun;
    private int distanceToSwim;


    public Animals(String animalName, int maxDistanceToRun, int maxDistanceToSwim, int distanceToRun, int distanceToSwim) {
        this.animalName = animalName;
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxDistanceToSwim = maxDistanceToSwim;
        this.distanceToRun = distanceToRun;
        this.distanceToSwim = distanceToSwim;
    }


    public void setAnimalName(String animalName) {
        this.animalName = animalName;
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

    public void setDistanceToRun(int distanceToRun) {
        this.distanceToRun = distanceToRun;
    }

    public void setDistanceToSwim(int distanceToSwim) {
        this.distanceToSwim = distanceToSwim;
    }

    public boolean run(){
        if (getDistanceToRun() > maxDistanceToRun){
            return false;
        } else {
            return true;
        }

    }

    public boolean swim(){
        if (getDistanceToSwim() > maxDistanceToSwim){
            return false;
        } else {
            return true;
        }
    }

    public void animalInfoToPrint(){
        if (run() == true){
            System.out.print(animalName + " can run " + getDistanceToRun()  + " meters, and ");
        } else {
            System.out.print("for " + animalName + " Too long distance to run");
        }
        if (swim() == true){
            System.out.println(animalName + " can swim " + getDistanceToSwim()  + " meters ");
        } else {
            System.out.println(animalName + " утонул");
        }
    }




    /*public String toString(){
        return animalName + " can run " + getDistanceToRun() + " meters" + " and can swim " + getDistanceToSwim() + " meters";
    }*/



}
