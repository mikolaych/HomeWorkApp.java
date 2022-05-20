package HomeWork8_1;

public class Treadmill implements DoIt{
    private int treadmillLong;

    public Treadmill(int treadmillLong) {
        this.treadmillLong = treadmillLong;
    }

    public int getTreadmillLong() {
        return treadmillLong;
    }

    public void setTreadmillLong(int treadmillLong) {
        this.treadmillLong = treadmillLong;
    }

    @Override
    public void doIt() {

    }
}
