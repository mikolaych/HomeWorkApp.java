package HomeWork8_1;

public class Wall implements DoIt{
    private int wallHeight;

    public Wall(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    public int getWallHeight() {
        return wallHeight;
    }

    public void setWallHeight(int wallHeight) {
        this.wallHeight = wallHeight;
    }

    @Override
    public void doIt() {
        System.out.println("You can jump it!");
    }
}
