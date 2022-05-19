package HomeWork8;

import java.util.Scanner;

public class Treadmill {
    private int distance;
    private boolean runJumpMethodStatus;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isRunJumpMethodStatus() {
        return runJumpMethodStatus;
    }

    public void setRunJumpMethodStatus(boolean runJumpMethodStatus) {
        this.runJumpMethodStatus = runJumpMethodStatus;
    }

    public void runDistance(String type, String name, int runDistance){
        System.out.println("Сейчас " + type + " " + name + " мощностью " + runDistance +" единиц попробует зарамсить тему!");
        System.out.print("Бежать ему:  ");
        Scanner millDistance = new Scanner(System.in);
        setDistance(millDistance.nextInt());
        if (getDistance() <= runDistance){
            System.out.println(name + " Пробежал " + getDistance() +  " единиц влегкую, даже не вспотел!");
            setRunJumpMethodStatus(true);
        } else {
            System.out.println(name + " к успеху шел, но не получилось, не фартануло. Мышцу потянул, дальше не пойдет, ибо мастдай");
            setRunJumpMethodStatus(false);
        }

    }
    public void runJumpMethod(Wall r){
        r.setRunJumpMethod(isRunJumpMethodStatus());
    }
}
