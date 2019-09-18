package ru.geekbrains.lesson1.animal;

import ru.geekbrains.lesson1.Participants;
import ru.geekbrains.lesson1.enums.Color;

public class HumanBeing extends Animal implements Participants {

    private boolean isOnDistance;
    private int runDistance;
    private int jumpHeight;
    private int swimDistance;

    public HumanBeing(String name, Color color, int age, int runDistance, int jumpHeight, int swimDistance) {
        super(name, color, age);
        this.isOnDistance = true;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
        this.swimDistance = swimDistance;
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

        System.out.println(String.format("The human %s has run distance %d", getName(), distance));
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
        System.out.println(String.format("The human %s has jumped %d", getName(), height));
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
        System.out.println(String.format("The human %s has swum %d", getName(), distance));

    }

    @Override
    public void voice() {

        System.out.println("Oh, G!");

    }
}
