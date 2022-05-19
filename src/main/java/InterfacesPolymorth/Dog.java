package InterfacesPolymorth;

public class Dog extends Animal{
    public Dog(int id) {
        super(id);
    }
    public void gav(){
        System.out.println(getId() + " say: Gav");
    }
}
