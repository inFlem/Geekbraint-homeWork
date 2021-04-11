package lesson6;

public class Cat extends Animals{

    public Cat() {
        super(200, 0);
    }

    @Override
    public void run(int run) {
        if ((run >= 0) && (run <= MAX_RUN))
            System.out.println(name + " пробежал " + run + " м");
        else System.out.println("Не смог пробежать");

    }

    @Override
    public void swim(int swim) {
       System.out.println("Не смог проплыть");
    }

}
