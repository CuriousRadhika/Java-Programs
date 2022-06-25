import java.util.Scanner;

class Transpose {
    public static int[][] input() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c[][] = new int[a][b];

        for (int x = 0; x < a; x++) {
            for (int y = 0; y < b; y++) {
                c[x][y] = sc.nextInt();
            }
        }
        return c;
    }

    public static void print(int[][] c) {
        for (int x = 0; x < c.length; x++) {
            for (int y = 0; y < c[0].length; y++) {
                System.out.print(c[x][y] + "\t");
            }
            System.out.println();
        }
    }

    public static void printTranspose(int[][] c) {
        for (int x = 0; x < c[0].length; x++) {
            for (int y = 0; y < c.length; y++) {
                System.out.print(c[y][x] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int x = 1; x <= t; x++) {
            int a[][] = input();

            print(a);
            System.out.println();
            printTranspose(a);

        }
    }
}
