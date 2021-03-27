package lesson1;

public class Main {

        public static void main(String[] args) {

            calculate(1.0f, 2.2f, 3.3f ,4.4f);
            task10and20(11, 12, 13, 20);
            isPositiveOrNegative(1);
            isNegative(1);
            greetings("Eugene");
            years(2020);

        }

        static void dType() {
            byte a = 1;
            short b = 2;
            int c = 3;
            long d = 4;
            float e = 1.0f;
            double f = 1.0;
            char g = 'a' ;
            boolean h = true;
        }

        public static float calculate(float a, float b, float c, float d){
            float res = a * (b + (c / d));
                System.out.println(res);
            return res;
        }

        public static boolean task10and20(int a, int b, int c, int d){
            int sum = a + b;
            boolean h = false;
            if (c <= sum && sum <= d) {
                h = true;
            }
            System.out.println(h);
            return h;
        }

        public static void isPositiveOrNegative(int a) {
            if (a >= 0)
                System.out.println("Положительное");
            else
                System.out.println("Отрицательное");
        }

        public static boolean isNegative(int a){
            boolean h = false;
            if (a <= 0){
                h = true;
            }
            System.out.println(h);
            return h;
        }

        public static void greetings(String name) {
            System.out.println("Привет" + " " + name);
        }

        static void years(int y) {
            if (!(y % 4 == 0) || ((y % 100 == 0) && !(y % 400 == 0))) {
                System.out.println(y + "не високосный");
            }
            else System.out.println(y + " високосный");
        }
}
