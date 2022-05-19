package InterfacesPolymorth;

import java.util.Scanner;

public class Animal implements Info{
    public int id;


    public Animal(int id) {
        this.id = id;
    }

    public void setId(int id) {
        System.out.print("Input animal's Id:  ");
        Scanner animalID = new Scanner(System.in);
        id = animalID.nextInt();
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void sleep(){
        System.out.println("Hello, I am " + getId() + ". " + "I am sleeping");
    }
    public void showInfo(){
        System.out.println("My Id is: " + this.getId());

    }

}


