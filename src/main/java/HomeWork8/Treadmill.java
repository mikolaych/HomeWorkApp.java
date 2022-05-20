package HomeWork8;

import java.util.Scanner;

public class Treadmill implements TreadmillMassive {
    private int distance;
    private static boolean runStatus;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public static boolean isRunStatus() {
        return runStatus;
    }
    public static void setRunStatus(boolean runStatus) {
        Treadmill.runStatus = runStatus;
    }
    public void runDistance(String type, String name, int runDistance){
        System.out.println("Сейчас " + type + " " + name + " выносливостю " + runDistance +" единиц попробует зарамсить тему по бегу!");
        System.out.print("Бежать ему(метры):  ");
        Scanner millDistance = new Scanner(System.in);
        setDistance(millDistance.nextInt());
        if (getDistance() <= runDistance){
            System.out.println(name + " Пробежал " + getDistance() +  " единиц влегкую, даже не вспотел!");
            setRunStatus(true);
        } else {
            System.out.println(name + " к успеху шел, но не получилось, не фартануло. Мышцу потянул, дальше не пойдет, ибо мастдай");
            setRunStatus(false);
        }

    }

}
