import java.util.Random;
import java.util.Scanner;

import static lesson1.lesson1.*;
import static lesson2.lesson2.*;
import static lesson3.lesson3.userRandom;
import static lesson4.lesson4.*;


public class Main {

    public static Scanner keyboard = new Scanner(System.in);


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
            //keyboard.close();
        //lesson4
            initMap();
            printMap();
                while (true) {
                    humanTurn();
                    printMap();
                    if (checkWin(DOT_X)) {
                        System.out.println("Победил человек");
                        break;
                    }
                    if (isMapFull()) {
                        System.out.println("Ничья");
                        break;
                    }
                    aiTurn();
                    printMap();
                    if (checkWin(DOT_O)) {
                        System.out.println("Победил Компьютер");
                        break;
                    }
                    if (isMapFull()) {
                        System.out.println("Ничья");
                        break;
                    }
                }
                System.out.println("Игра окончена");
            keyboard.close();
    }
}
