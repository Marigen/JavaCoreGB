package ru.geekbrains.lesson1;

import ru.geekbrains.lesson1.animal.Cat;
import ru.geekbrains.lesson1.course.Course;
import ru.geekbrains.lesson1.course.Cross;
import ru.geekbrains.lesson1.course.Wall;
import ru.geekbrains.lesson1.course.Water;
import ru.geekbrains.lesson1.enums.Color;

public class Application {

    public static void main(String[] args) {
        Team team = new Team(
                new Cat("Blackie", Color.BLACK, 1, 100, 5),
                new Cat("Snowball", Color.WHITE, 3, 80, 7)

        );

        Course course = new Course(
                new Cross(50),
                new Wall(10),
                new Cross(90),
                new Water(5)
        );

        course.doIt(team);

        team.showResults();
    }

}
