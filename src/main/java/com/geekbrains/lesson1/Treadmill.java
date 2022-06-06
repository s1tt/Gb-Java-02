package com.geekbrains.lesson1;

public class Treadmill implements Obstructions {
    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Member member) {
        member.run(distance);
    }
}
