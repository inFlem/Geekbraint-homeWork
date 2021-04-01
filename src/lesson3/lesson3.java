package lesson3;

import java.util.Random;
import java.util.Scanner;

public class lesson3 {

    public static final int AMOUNT_ATTEMPT = 3;

    public static Scanner keyboard = new Scanner(System.in);
    public static Random random = new Random();


    public static void userRandom() {

        System.out.println("Компьютер загадал число от 0 до 9, попробуй угадать его, у тебя есть 3 попытки");

        int[] fillArrayRandom = new int[10];

        int numberAttempts = AMOUNT_ATTEMPT;

        int indCeil = random.nextInt(fillArrayRandom.length);


            while (numberAttempts > 0) {

                int attempt = keyboard.nextInt();

                if (attempt == indCeil) {
                    System.out.println("Ты угадал число");
                    numberAttempts = 0;
                } else {
                    System.out.println("Ты не угадал число, повтори попытку. Осталось попыток " + (numberAttempts - 1));
                        if (attempt > indCeil)
                            System.out.println("Твое число больше");
                        else
                            System.out.println("Твое число меньше");
                    numberAttempts--;
                }
            }

            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int repeat = keyboard.nextInt();
            if (repeat == 1) userRandom();

        }
}

