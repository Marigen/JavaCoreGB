package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participants;
import ru.geekbrains.lesson1.enums.Color;

public class Cat extends Animal implements Participants {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, Color color, int age, int runDistance, int jumpHeight) {
        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance;
    }

    @Override
    public void run(int distance) {

        if (!isOnDistance) {
            return;
        }

        if (distance > runDistance) {
            isOnDistance = false;
            return;
        }

        System.out.println(String.format("The cat %s has run distance %d", getName(), distance));

    }

    @Override
    public void jump(int height) {

        if (!isOnDistance) {
            return;
        }
        if (height > jumpHeight) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("The cat %s has jumped %d", getName(), height));

    }

    @Override
    public void swim(int distance) {

        isOnDistance = false;

        System.out.println("Cats really don't like to swim!");

    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
