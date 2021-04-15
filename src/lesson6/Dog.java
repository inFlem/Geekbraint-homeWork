package lesson6;

public class Dog extends Animals {

    public Dog() {
        super(500, 10);
    }

    @Override
    public void run(int run) {
        if ((run >= 0) && (run <= MAX_RUN))
            System.out.println(name + " пробежал " + run + " м");
        else System.out.println("Не смог пробежать");
    }

    @Override
    public void swim(int swim) {
        if ((swim >= 0) && (swim <= MAX_SWIM))
            System.out.println(name + " проплыл " + swim + " м");
        else System.out.println("Не смог проплыть");
    }
}
