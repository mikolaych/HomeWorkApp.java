package InterfacesPolymorth;

import java.util.Scanner;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void setName(String name) {
        System.out.print("Input person's name:  ");
        Scanner personName = new Scanner(System.in);
        name = personName.nextLine();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello(){
        System.out.println("Hello from " + getName() + "!");
    }
    public void showInfo(){
        System.out.println("My name is: " + this.getName());

    }
}
