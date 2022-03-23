package com.geekbrains.lesson1;

public class Human implements Member {
    private String name;
    private int maxRunDistance;
    private int maxJumpDistance;
    private boolean inGame = true;

    public Human(String name, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public void run(int distance) {
        if (distance >= maxRunDistance) {
            System.out.println("Human "+ name +" cannot run " + distance + " meters and is out");
            inGame = false;
        } else {
            System.out.println("Human " + name +" ran " + distance + " meters");
        }
    }

    @Override
    public void jump(int height) {
        if (height >= maxJumpDistance) {
            System.out.println("Human " + name +" cannot jump to a height of " + height +" meters and is out");
            inGame = false;
        } else {
            System.out.println("Human "+ name + " jumped to a height of "+ height + " meters");
        }
    }

    public boolean isInGame() {
        return inGame;
    }
}
