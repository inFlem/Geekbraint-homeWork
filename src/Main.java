import java.util.Random;
import java.util.Scanner;

import static lesson1.lesson1.*;
import static lesson2.lesson2.*;
import static lesson3.lesson3.userRandom;


public class Main {

    public static final int QUANTITY_ATTEMPT = 3;

    public static Scanner keyboard = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {
        //lesson1
            calculate(1.0f, 2.2f, 3.3f ,4.4f);
            task10and20(11, 12, 13, 20);
            isPositiveOrNegative(1);
            isNegative(1);
            greetings("Eugene");
            years(2020);
        //lesson2
            invertArray();
            System.out.println("\n");
            fillArray();
            System.out.println("\n");
            changeArray();
            System.out.println("\n");
            fillDiagonal();
        //lesson3
            userRandom();
            keyboard.close();
        }

}
