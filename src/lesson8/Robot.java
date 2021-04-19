package lesson8;

public class Robot implements RunningJumping {
    private int run;
    private int jump;

    public Robot(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }

    @Override
    public int getRun() {
        System.out.println("Robot " + run + " run");
        return run;
    }

    @Override
    public int getJump() {
        System.out.println("Robot " + jump + " jump");
        return jump;
    }

}
