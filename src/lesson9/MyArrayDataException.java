package lesson9;

public class MyArrayDataException extends Throwable {

    int i;
    int j;

    public MyArrayDataException(int i, int j) {
        super("преобразование не удалось, убедитесь что в ячейке " + i + " " + j
                + " не лежит символ или текст вместо числа");
        this.i = i;
        this.j = j;
    }
}