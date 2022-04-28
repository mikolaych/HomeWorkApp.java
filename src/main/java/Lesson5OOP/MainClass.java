package Lesson5OOP;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Nikolay", "Petrov", "Alexandrovich", "Engineer", "petrov1999@mail.ru", "+7845652285", 5000000, 40);
        Employee employee2 = new Employee("Sergey", "Dmitriev", "Innokentyevich", 40);
        Employee employee3 = new Employee("Petr", "Sokolov", "Georgievitch", 50);
        Employee employee4 = new Employee("Mihail", "Kovalenko", "Mihailovich", 20);
        Employee employee5 = new Employee("Alexey", "Vitalyevich", "Vladimirovich", 35);

        Employee[] allEmployees = {employee1, employee2, employee3, employee4, employee5};

        employee1.ageGetPension(30);
        employee1.printInfo();
        for (int i = 0; i < allEmployees.length; i++) {
            System.out.println(Arrays.toString(allEmployees));
            System.out.println("--------------------------");
        }
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Sergey", "Dmitriev", "Innokentyevich", 25);
        emplArray[1] = new Employee("Petr", "Sokolov", "Georgievitch", 50);
        emplArray[2] = new Employee("Nikolay", "Petrov", "Alexandrovich", 60);
        emplArray[3] = new Employee("Mihail", "Kovalenko", "Mihailovich", 35);
        emplArray[4] = new Employee("Alexey", "Vitalyevich", "Vladimirovich", 64);

        for (int i = 0; i < emplArray.length; i++) {
            if (emplArray[i].getAge() >= 60){
                System.out.print(emplArray[i]);
            }
            System.out.println();
        }





    }
}
