import homework9.PhoneBook;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Задание 1
        //задаем массив с повторяющимися словами
        String[] words = {"ананас", "яблоко", "груша", "персик", "банан", "груша", "персик", "абрикос", "груша", "вишня", "ананас", "персик", "арбуз", "дыня", "груша"};
        //коллекция слов без повторений
        Set<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, words);
        //вывод коллекции слов без повторений
        System.out.println("Уникальные слова в массиве: " + uniqueWords);
        //коллекция с подсчетом повторений слов
        Map<String, Integer> quantityRepeatWords = new HashMap<>();
        for (String word : words) {
            quantityRepeatWords.put(word, quantityRepeatWords.getOrDefault(word, 0) + 1);
        }
        //вывод коллекции с подсчетом повторений слов
        System.out.println("Количество повторений каждого слова в массиве: " + quantityRepeatWords);

        //Задание 2
        PhoneBook book1 = new PhoneBook();
        book1.add("Иванов", "555");
        book1.add("Смирнов", "666");
        book1.add("Иванов", "777");
        book1.add("Смирнов", "888");
        book1.add("Сергеев", "999");
        book1.add("Алексеев", "444");
        book1.add("Иванов", "333");

        book1.getPhone("Иванов");
        book1.getPhone("Смирнов");
    }
}