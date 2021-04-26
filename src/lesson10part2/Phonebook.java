package lesson10part2;

import java.util.*;

public class Phonebook {

    private HashMap<String, String> phonebook = new HashMap<>();

    public void add(String number, String surname) {
        phonebook.put(number, surname);
    }

    public void get(String surname) {
        if (phonebook.containsValue(surname)) {
            Set<Map.Entry<String, String>> set = phonebook.entrySet();
            for (Map.Entry<String, String> temp : set) {
                if (temp.getValue().equals(surname)) {
                    System.out.println(temp.getValue() + ": " + temp.getKey());
                }
            }
        } else {
            System.out.println("Указанной фамилии нет в базе данных");
        }
    }
}
