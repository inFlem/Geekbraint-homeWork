package lesson8;

public class Main {

    public static void main(String[] args) {

        RunningJumping[] runningJumpings = new RunningJumping[3];
        runningJumpings[0] = new Human(10,10);
        runningJumpings[1] = new Cat(5,20);
        runningJumpings[2] = new Robot(30,30);

        Exercise[] exercises = new Exercise[2];
        exercises[0] = new Wall(15);
        exercises[1] = new RunningTrack(10);

        for (int i = 0; i < runningJumpings.length; i++) {
            for (int j = 0; j < exercises.length ; j++) {
                if (exercises[j].toJump(runningJumpings[i].getJump()) ||
                        exercises[j].toRun(runningJumpings[i].getRun())){
                } else {
                    break;
                }
            }
        }

    }
}
