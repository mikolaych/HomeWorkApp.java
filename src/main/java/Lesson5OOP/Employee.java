package Lesson5OOP;

public class Employee {
    String name;
    String surname;
    String patronymic;
    String position;
    String email;
    String phoneNumber;
    int salary;
    int age;
    int ageToPension;

    public Employee(String name, String surname, String patronymic, String position, String email, String phoneNumber, int salary, int age) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String name, String surname, String patronymic, int age ) {
        this(name, surname, patronymic, "Director", "dir@yu.ui", "+95645665421", 8000000, age);

    }

    public void ageGetPension(int age){
        ageToPension = 68 - age;
        if (age < 68) {
            System.out.println("До выхода на пенсию осталось: " + ageToPension + " лет");
        } else {
            System.out.println("Вы уже на пенсии");
        }
    }

    public void printInfo(){
        System.out.println(this.toString());

    }
    public String toString() {
        return (String.format("Employee %s %s %s %d years ago, position %s, had e-mail %s. His phone number is %s, salary is " + salary/100 + " RUR" , surname, name, patronymic, age, position, email, phoneNumber) );
    }

    public int getAge() {
        return age;
    }
}
