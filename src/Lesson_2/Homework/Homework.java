package Lesson_2.Homework;

public class Homework {

    private final static int SIZE = 4;

    public static void main(String[] args) {

        String Array1[][] = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"},
        };

        String Array2[][] = {
                {"-1", "2", "-3", "4"},
                {"5", "-6", "7", "-8"},
                {"H", "E", "L", "L"},
                {"13", "14", "15", "16"},
        };

        String Array3[][] = {
                {"-1", "2", "-3", "4"},
                {"5", "-6", "7", "-8"},
                {"0", "5"},
                {"13", "14", "15", "16"},
        };

        try {
            System.out.println("Сумма массива 1: " + arraySum(Array1));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex);
        }

        try {
            System.out.println("Сумма массива 2: " + arraySum(Array2));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex);
        }

        try {
            System.out.println("Сумма массива 3: " + arraySum(Array3));
        } catch (MyArraySizeException | MyArrayDataException ex) {
            System.out.println(ex);
        }


    }

    public static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int result = 0;

        if (array.length != SIZE) {
            throw new MyArraySizeException();
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != SIZE) {
                throw new MyArraySizeException();
            }

        for (int j=0; j<array[i].length; j++) {
            try {
                result += Integer.valueOf(array[i][j]);
            } catch (NumberFormatException ex) {
                throw new MyArrayDataException(i, j, array[i][j], ex);
            }
        }
    }

        return result;

    }
}
