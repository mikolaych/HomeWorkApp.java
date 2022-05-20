package HomeWork8;

public class MainClass {
    public static void main(String[] args) {
        Human human = new Human("", "Nik", 200, 100);
        Cat cat = new Cat("", "Bars", 100, 200);
        Robot robot = new Robot("", "Rob", 500, 300);
        Treadmill treadmill1 = new Treadmill(0);
        Wall wall1 = new Wall(0);
        Treadmill treadmill2 = new Treadmill(0);
        Wall wall2 = new Wall(0);
        Action[] actions = new Action[3];
        actions[0] = cat;
        actions[1] = human;
        actions[2] = robot;
        TreadmillMassive[] treadmillMassive = new TreadmillMassive[2];
        treadmillMassive[0] = treadmill1;
        treadmillMassive[1] = treadmill2;
        WallMassive[] wallMassive = new WallMassive[2];
        wallMassive[0] = wall1;
        wallMassive[1] = wall2;
        for (int i = 0; i < actions.length; i++) {
            for (int j = 0; j < treadmillMassive.length; j++) {
                actions[i].run((Treadmill) treadmillMassive[j]);
                actions[i].jump((Wall) wallMassive[j]);
            }
        }


        /*cat.run(treadmill);
        cat.jump(wall);
        human.run(treadmill);
        human.jump(wall);
        robot.run(treadmill);
        robot.jump(wall);*/

    }

}
