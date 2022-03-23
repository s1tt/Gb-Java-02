package com.geekbrains.lesson1;

public class Wall implements Obstructions {
    private int height;

    public Wall(int height) {
        this.height = height;
    }


    @Override
    public void doIt(Member member) {
        member.jump(height);
    }
}
