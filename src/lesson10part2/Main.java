package lesson10part2;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("74953001", "Смирнов");
        phonebook.add("74953002", "Смирнов");
        phonebook.add("74953003", "Кузнецов");
        phonebook.add("74953004", "Попов");
        phonebook.add("74953005", "Васильев");
        phonebook.add("74953006", "Васильев");

        phonebook.get("Петров");
        phonebook.get("Смирнов");
        phonebook.get("Кузнецов");
        phonebook.get("Попов");
        phonebook.get("Васильев");
    }
}
