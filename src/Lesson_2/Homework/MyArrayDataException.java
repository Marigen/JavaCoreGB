package Lesson_2.Homework;

public class MyArrayDataException extends Throwable {

    public MyArrayDataException(int i, int j, String value, NumberFormatException ex) {

        super(String.format("Некорректное значение %s в ячейка [%d][%d]", value, i, j), ex);

    }

}
