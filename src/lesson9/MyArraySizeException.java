package lesson9;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException(int line, int column) {
        super("Не правильное количество строк и столбцов");
    }
}
