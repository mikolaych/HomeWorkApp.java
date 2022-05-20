package HomeWork8;

public class MainClass {
    public static void main(String[] args) {
        Human human = new Human("", "Nik", 200, 100);
        Cat cat = new Cat("", "Bars", 100, 200);
        Robot robot = new Robot("", "Rob", 500, 300);
        Treadmill treadmill = new Treadmill(0);
        Wall wall = new Wall(0);
        cat.run(treadmill);
        cat.jump(wall);
        human.run(treadmill);
        human.jump(wall);
        robot.run(treadmill);
        robot.jump(wall);

    }

}
