package HomeWork8;

public class Robot implements Action {
    private final String type;
    private String name;
    private int runDistance;
    private int jumpDistance;
    private boolean status;

    public Robot(String type, String name, int runDistance, int jumpDistance) {
        this.type = "Железяка";
        this.name = name;
        this.runDistance = runDistance;
        this.jumpDistance = jumpDistance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public int getJumpDistance() {
        return jumpDistance;
    }

    public void setJumpDistance(int jumpDistance) {
        this.jumpDistance = jumpDistance;
    }

    @Override
    public void run(Treadmill r) {
        r.runDistance(type, name, getRunDistance());

    }

    @Override
    public void jump(Wall j) {
        j.jumpDistance(type, name, getJumpDistance());
    }


}
