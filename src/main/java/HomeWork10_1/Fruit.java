package HomeWork10_1;

abstract class Fruit {
    private float weight;
    public Fruit(float weight) {
        this.weight = weight;
    }
    public Fruit() {
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getWeight() {
        return weight;
    }

}
