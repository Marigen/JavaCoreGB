package ru.geekbrains.lesson1.course;

import ru.geekbrains.lesson1.Participants;
import ru.geekbrains.lesson1.Team;

public class Course {

    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Participants participant : team.getParticipants()) {
            for (Obstacle obstacle : obstacles) {
                obstacle.doIt(participant);
                
                if (!participant.isOnDistance()) {
                    break;
                }
            }
        }
    }

}
