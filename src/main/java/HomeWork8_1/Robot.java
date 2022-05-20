package HomeWork8_1;

import java.util.Scanner;

public class Robot {
    private final String type;
    private String name;
    private int distance;
    private int height;

    public Robot(String type, String name, int distance, int height) {
        this.type = "Железяка";
        this.name = name;
        this.distance = distance;
        this.height = height;
    }
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public void run(){
        System.out.print("Сколько может пробежать:  ");
        Scanner inputDistance = new Scanner(System.in);
        setDistance(inputDistance.nextInt());
        System.out.println(type + " " + name + " проскакал " + getDistance() + " метров");

    }
    public void jump(){
        System.out.print("Ведите высоту прыжка:  ");
        Scanner inputHeight = new Scanner(System.in);
        setDistance(inputHeight.nextInt());
        System.out.println(type + " " + name + " прыгнул на " + getHeight() + " сантиметров");

    }
}
