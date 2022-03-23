package com.geekbrains.lesson1;

public class MainApp {
    public static void main(String[] args) {
        Obstructions[] obstructions = {
                new Wall(2),
                new Wall(22),
                new Treadmill(2222222)
        };

        Member[] members = {
                new Cat("Barsik",11, 12),
                new Human("Anton",10, 10),
                new Robot("Bender",9,33)
        };

        for (Member m : members) {
            for (Obstructions o : obstructions) {
                o.doIt(m);
                if (!m.isInGame()) {
                    break;
                }
            }
        }
    }
}
