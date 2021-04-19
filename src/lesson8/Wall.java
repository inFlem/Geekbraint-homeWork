package lesson8;

public class Wall implements Exercise {
    private int jump;

    public Wall(int jump) {
        this.jump = jump;
    }

    @Override
    public boolean toRun(int m) {
        return false;
    }

    @Override
    public boolean toJump(int h) {
        if (h >= jump) {
            System.out.println("Смог прыгнуть");
            return true;
        } else {
            System.out.println("Не смог прыгнуть");
            return false;
        }
    }
}
