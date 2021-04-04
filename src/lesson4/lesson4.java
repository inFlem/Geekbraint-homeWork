package lesson4;

import java.util.Random;
import java.util.Scanner;

    public class lesson4 {
        public static int SIZE = 3;
        public static final char DOT_EMPTY = '•';
        public static final char DOT_X = 'X';
        public static final char DOT_O = 'O';
        public static char[][] map;

        public static Scanner keyboard = new Scanner(System.in);
        public static Random rand = new Random();


        public static boolean checkWin(char symb) {
            int countVertical;
            int countHorizontal;
            int countDiagonalL = 0;
            int countDiagonalR = 0;
            for (int i = 0; i <= SIZE - 1; i++) {
                countVertical = 0;
                countHorizontal = 0;
                for (int j = 0; j <= SIZE - 1; j++) {

                    if (map[i][j] == symb) {
                        countHorizontal++;
                        if (countHorizontal == SIZE) return true;
                    }

                    if (map[j][i] == symb) {
                        countVertical++;
                        if (countVertical == SIZE) return true;
                    }
                }

                if (map[i][i] == symb) {
                    countDiagonalL++;
                    if (countDiagonalL == SIZE) return true;
                } else countDiagonalL = 0;

                if (map[i][SIZE - 1 - i] == symb) {
                    countDiagonalR++;
                    if (countDiagonalR == SIZE) return true;
                } else countDiagonalR = 0;
            }
            return false;
        }

        public static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) return false;
                }
            }
            return true;
        }

        public static void aiTurn() {
            int x, y;
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (!isCellValid(x, y));
            System.out.println("Компьютер выполнил ход в точку " + (x + 1) + " " + (y + 1));
            map[y][x] = DOT_O;
        }

        public static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координаты в формате X Y");
                x = keyboard.nextInt() - 1;
                y = keyboard.nextInt() - 1;
            } while (!isCellValid(x, y));
            map[y][x] = DOT_X;
        }

        public static boolean isCellValid(int x, int y) {
            if (x >= 0 && x < SIZE && y >= 0 && y < SIZE) {
                if (map[y][x] == DOT_EMPTY) return true;
            }
            return false;
        }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

