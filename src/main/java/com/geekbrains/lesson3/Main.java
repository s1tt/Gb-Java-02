package com.geekbrains.lesson3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Apple", "Orange", "Cat", "Cat", "Dog", "Dog", "Dog"};
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : array) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println(map.keySet());

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Evplov", "+722222");
        phoneBook.add("Esin", "+44333");
        phoneBook.add("Rakovsky", "+554444");
        phoneBook.add("Evplov", "+722222");
        phoneBook.add("Evplov", "+7222223");

        System.out.println("Numbers found: " + phoneBook.find("Evplov"));


    }

}
