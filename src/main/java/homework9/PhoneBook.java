package homework9;

import java.util.*;

public class PhoneBook {
    private static TreeMap<String, ArrayList<String>> phoneBook = new TreeMap<>();

    public static void add(String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            ArrayList<String> phoneNumber = new ArrayList<>();
            phoneNumber.add(phone);
            phoneBook.put(name, phoneNumber);
        } else {
            phoneBook.get(name).add(phone);
        }
    }

    public static void getPhone(String name) {
        for (Map.Entry<String, ArrayList<String>> entry : phoneBook.entrySet()) {
            if (entry.getKey() == name) {
                System.out.println("Номера телефонов по фамилии \"" + name + "\": " + entry.getValue());
            }
        }
    }
}
