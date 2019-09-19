package Lesson_2.Additional_HomeWork;

public class WorkTimeApp {

    public static void main(String[] args) {

        Days day = Days.FRIDAY;

        System.out.println("Сегодня - " + day.getRussianDays() + ".\n" +
                "Осталось работать: " + day.getWorkHours() + " часов.");

    }

}
