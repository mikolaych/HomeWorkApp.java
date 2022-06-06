package HomeWork11;

import java.util.HashMap;

public class MainClass {
    public static void main(String[] args) {
       /* String[] words = {"один", "два", "три", "четыре", "пять", "один", "два", "три", "четыре", "пять", "один", "два", "три", "четыре", "пять",};
        HashMap<String, Integer> mass = new HashMap<>();
        for (String i : words){
            mass.put(i, mass.getOrDefault(i, 0)+1);
        }
        System.out.println(mass);*/

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Маша", "+78562546");
        phoneBook.add("Паша", "+74568524");
        phoneBook.add("Саша", "+98542468");
        phoneBook.add("Маша", "+48751245");
        phoneBook.add("Глаша", "+64587124");
        phoneBook.add("Глаша", "+74012458574");

        phoneBook.get("Глаша");
        phoneBook.get("Саша");
        phoneBook.get("Маша");


    }
}
