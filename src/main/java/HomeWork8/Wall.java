package HomeWork8;

import java.util.Scanner;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void jumpDistance(String type, String name, int heightDistance){
        boolean runStatus = Treadmill.isRunStatus();
        if (runStatus) {
            System.out.println("А теперь " + type + " по имени " + name + " продемонстрирует свое мастерство сигая через стену! Этот кузнечик сигает на " + heightDistance + " сантиметров!");
            System.out.print("А высота стены(см):  ");
            Scanner wallHeight = new Scanner(System.in);
            setHeight(wallHeight.nextInt());
            if (getHeight() <= heightDistance) {
                System.out.println("Перепрыгнул " + getHeight() +  " единиц влегкую и ушел в поднебесья, как орел");
                System.out.println(type + " " + name + " походу все препятствия прошел и типа победил!");
            } else {
                System.out.println(name + " допрыгался, убился нафиг, и победа ему не светит. А так хорошо все начиналось! Печалька, однако...");
            }
        }
    }
}
