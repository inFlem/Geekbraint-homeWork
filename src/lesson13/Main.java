package lesson13;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Main {

    public static int CARS_COUNT = 4;
    public static  CountDownLatch countDownLatchFinish = new CountDownLatch(CARS_COUNT);
    public static  CountDownLatch countDownLatchReady = new CountDownLatch(CARS_COUNT);
    public static  CyclicBarrier cyclicBarrierStart = new CyclicBarrier(CARS_COUNT);

    public static void main(String[] args) throws InterruptedException {
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
                Race race = new Race(new Road(60), new Tunnel(), new Road(40));
                Car[] cars = new Car[CARS_COUNT];
                for (int i = 0; i < cars.length; i++) {
                    cars[i] = new Car(race, 20 + (int) (Math.random() * 10));
                }
                for (int i = 0; i < cars.length; i++) {
                    new Thread(cars[i]).start();
                }

        countDownLatchReady.await();
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!");
        countDownLatchFinish.await();
                System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
    }
}

