package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participants;
import ru.geekbrains.lesson1.enums.Color;

public class Dalek extends Animal implements Participants {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public Dalek(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
    }

    @Override
    public boolean isOnDistance() {
        return isOnDistance();
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

        System.out.println(String.format("The dalek %s has run distance %d", getName(), distance));

    }

    @Override
    public void jump(int height) {

        isOnDistance = false;

        System.out.println("Daleks can't jump! They float.");

    }

    @Override
    public void swim(int distance) {

        if (!isOnDistance) {
            return;
        }
        if (distance > swimDistance) {
            isOnDistance = false;
            return;
        }
        System.out.println(String.format("The dalek %s has floated %d", getName(), distance));

    }

    @Override
    public void voice() {

        System.out.println("Destroy!");

    }
}
