package HomeWork8;

import java.util.Scanner;

public class Wall {
    private int height;
    private boolean runJumpMethod;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setRunJumpMethod(boolean runJumpMethod) {
        this.runJumpMethod = runJumpMethod;
    }

    public boolean isRunJumpMethod() {
        return runJumpMethod;
    }

    public void jumpDistance(String type, String name, int heightDistance){
        if (isRunJumpMethod()) {
            System.out.println("А теперь " + type + " по имени " + name + " продемонстрирует свое мастерство сигая через стену! Этот кузнечик сигает на " + heightDistance + " единиц");
            System.out.print("высота стены:  ");
            Scanner wallHeight = new Scanner(System.in);
            setHeight(wallHeight.nextInt());
            if (getHeight() <= heightDistance) {
                System.out.println("Перепрыгнул " + getHeight() +  " единиц влегкую и ушел в поднебесья, как орел");
            } else {
                System.out.println(name + "Допрыгался, убился нафиг");
            }
        }
    }
}
