import java.util.Scanner;

import static lesson1.lesson1.*;
import static lesson2.lesson2.*;
import static lesson3.lesson3.userRandom;
import static lesson4.lesson4.*;
import lesson5.employee;


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
        //lesson5
            employee[] personArr  = new employee[5];
            personArr[0] = new employee("Ivanov Ivan", "Engineer", "ivivan@mail.com", "892312311", 30000, 30);
            personArr[1] = new employee("Ivanov Oleg", "Electric", "ioleg@mail.com", "892312312", 40000, 35);
            personArr[2] = new employee("Ivanov Igor", "Administrator", "iigor@mail.com", "892312313", 50000, 40);
            personArr[3] = new employee("Ivanov Eugene", "Engineer", "ieugene@mail.com", "892312314", 60000, 45);
            personArr[4] = new employee("Ivanov Andrew", "Director", "iandrew@mail.com", "892312315", 70000, 50);

            for (int i = 0; i < personArr.length; i++) {
                if (personArr[i].getAge() > 40){
                    personArr[i].print();
                }
            }
    }
}
