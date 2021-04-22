package lesson9;

import java.util.Scanner;

 public class Main {

    public static void main(String[] args) throws MyArrayDataException {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Введите размер линии массива");
        int line = keyboard.nextInt();
        System.out.println("Введите размер столбца массива");
        int column = keyboard.nextInt();

        String[][] newArr = new String[line][column];

        try {
            createTwoArray(newArr, keyboard, line, column);
            printTwoArray(newArr);
            System.out.println("Результат расчета " + changeArray(newArr, line, column));
        } catch (MyArrayDataException | MyArraySizeException e) {
            e.printStackTrace();
        }
       keyboard.close();
    }

    public static void createTwoArray(String[][] arr, Scanner keyboard, int line, int column)  throws
            MyArraySizeException{

        if (line != 4 || column != 4) throw new MyArraySizeException(line, column);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = String.valueOf(j + 1);
            }
        }
    }

    public static int changeArray(String[][] arr, int line, int column) throws MyArrayDataException{
        int sum = 0;
        int[][] arrInt = new int[line][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    arrInt[i][j] = Integer.parseInt(arr[i][j]);
                    sum += arrInt[i][j];
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println("Преобразованный массив");
        printChangeArray(arrInt);
        return sum;
    }

    private static void printTwoArray(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

     private static void printChangeArray(int[][] arr) {
         for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                 System.out.print(arr[i][j]);
             }
             System.out.println();
         }
     }
}