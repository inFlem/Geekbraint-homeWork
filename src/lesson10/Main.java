package lesson10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = Arrays.asList(
                "Челябинск", "Москва", "Казань", "Тюмень", "Екатеринбург",
                "Сочи", "Красноярск", "Челябинск", "Москва", "Сочи");

        Set<String> set = new HashSet<>(arrayList);

        System.out.println("Уникальные слова");
        System.out.println(set.toString());
        System.out.println("Подсчет кол-во встречаемых слов");
        for (String key: set) {
            int count = Collections.frequency(arrayList, key);
            System.out.println(key + ": " + count);
        }
    }
}