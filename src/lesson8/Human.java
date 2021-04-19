package lesson8;

public class Human implements RunningJumping {
    private int run;
    private int jump;

    public Human(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int getRun() {
        System.out.println("Human " + run + " run");
        return run;
    }

    @Override
    public int getJump() {
        System.out.println("Human " + jump + " jump");
        return jump;
    }

}
