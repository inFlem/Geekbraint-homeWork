package lesson6;

public abstract class Animals {

    public String name;
    protected int MAX_RUN;
    protected int MAX_SWIM;

    public Animals(int MAX_RUN, int MAX_SWIM) {
        this.MAX_RUN = MAX_RUN;
        this.MAX_SWIM = MAX_SWIM;
    }

    public abstract void run(int run);

    public abstract void swim(int swim);

}
