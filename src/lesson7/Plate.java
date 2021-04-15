package lesson7;

public class Plate {

        private int food;

        public Plate(int food) {
            this.food = food;
        }

        public boolean decreaseFood(int n) {
            if (food >= n) {
                food -= n;
                return true;
            } else {
                System.out.println("В тарелке с едой не может получиться отрицательного количества еды ");
                return false;
            }

        }

        void addFood(){
            this.food += 100;
            System.out.println("Добавили еду в тарелку");
        }

        boolean infoFood(int n) {
            return (food - n) >= 0;
        }

        public void info() {
                System.out.println("plate: " + food);
            }
}


