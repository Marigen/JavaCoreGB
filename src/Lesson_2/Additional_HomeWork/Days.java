package Lesson_2.Additional_HomeWork;

public enum Days {

    MONDAY("Понедельник", 40),
    TUESDAY("Вторник", 32),
    WEDNESDAY("Среда", 24),
    THURSDAY("Четверг", 16),
    FRIDAY("Пятница", 8);

    private String russianDays;
    private int workHours;

    Days(String russianDays, int workHours) {
        this.russianDays = russianDays;
        this.workHours = workHours;
    }

    public String getRussianDays() {
        return russianDays;
    }

    public int getWorkHours() {
        return workHours;
    }
}
