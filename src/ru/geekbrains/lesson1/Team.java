package ru.geekbrains.lesson1;

public class Team {

    private Participants[] participants;

    public Team(Participants... participants) {
        this.participants = participants;
    }

    public Participants[] getParticipants() {
        return participants;
    }

    public void showResults() {
        System.out.println("Результаты :");
        for (Participants participant : participants) {
            System.out.println(participant);
        }
    }
}