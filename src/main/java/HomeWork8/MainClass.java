package HomeWork8;

public class MainClass {
    public static void main(String[] args) {
        Human human = new Human("", "Nik", 200, 1);
        Cat cat = new Cat("", "Bars", 100, 2);
        Robot robot = new Robot("", "Rob", 500, 3);
        Treadmill treadmill = new Treadmill(10);
        Wall wall = new Wall(2);
        cat.run(treadmill);
        cat.jump(wall);


    }
    public static void start(){

    }
}
