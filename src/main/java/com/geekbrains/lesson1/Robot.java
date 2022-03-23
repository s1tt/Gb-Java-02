package com.geekbrains.lesson1;

public class Robot implements Member {
    private String name;
    private int maxRunDistance;
    private int maxJumpDistance;
    private boolean inGame = true;

    public Robot(String name, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
    }

    @Override
    public void run(int distance) {
        if (distance >= maxRunDistance) {
            System.out.println("Robot "+ name +" cannot run " + distance + " meters and is out");
            inGame = false;
        } else {
            System.out.println("Robot " + name +" ran " + distance + " meters");
        }
    }

    @Override
    public void jump(int height) {
        if (height >= maxJumpDistance) {
            System.out.println("Robot " + name +" cannot jump to a height of " + height +" meters and is out");
            inGame = false;
        } else {
            System.out.println("Robot "+ name + " jumped to a height of "+ height + " meters");
        }
    }

    @Override
    public boolean isInGame() {
        return inGame;
    }
}
