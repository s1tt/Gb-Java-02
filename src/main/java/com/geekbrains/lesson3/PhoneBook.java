package com.geekbrains.lesson3;

import java.util.HashMap;
import java.util.HashSet;

public class PhoneBook {
    private HashMap<String, HashSet<String>> map;

    public PhoneBook() {
        this.map = new HashMap<>();
    }

    public void add(String surname, String phone){
        if (!map.containsKey(surname)) {
            map.put(surname, new HashSet<>());
        }
        map.get(surname).add(phone);
    }

    public HashSet<String> find(String surname) {
        if (!map.containsKey(surname)) {
            return new HashSet<>();
        }
        return map.get(surname);
    }




}
