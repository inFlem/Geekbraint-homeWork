package lesson8;

public class Cat implements RunningJumping {
    private int run;
    private int jump;

    public Cat(int run, int jump) {
        this.run = run;
        this.jump = jump;
    }
    @Override
    public int getRun() {
        System.out.println("Cat " + run + " run");
        return run;
    }

    @Override
    public int getJump() {
        System.out.println("Cat " + jump + " jump");
        return jump;
    }

}


