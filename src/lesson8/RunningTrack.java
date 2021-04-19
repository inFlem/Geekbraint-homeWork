package lesson8;

public class RunningTrack implements Exercise{
    private int run;

    public RunningTrack(int run) {
        this.run = run;
    }

    @Override
    public boolean toRun (int m){
        if (m >= run){
            System.out.println("Смог пробежать");
            return true;
        }else{
            System.out.println("Не смог пробежать");
            return false;
        }
    }

    @Override
    public boolean toJump(int h) {
        return false;
    }
}
