package HomeWork11;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    HashMap<String, HashSet<String>> phBook;
    public PhoneBook(){
        this.phBook = new HashMap<>();
    }
    public void add(String name, String phone){
        HashSet<String> book = phBook.getOrDefault(name, new HashSet<>());
        book.add(phone);
        phBook.put(name, book);
    }
    public void get(String name){
        System.out.println("Контакт: " + name + " || Телефон(-ы): " + phBook.getOrDefault(name, new HashSet<>()));
    }
}
