import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] c = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            t[i] = scanner.nextInt();
        }
        int x = 100000;
        int y = 100000;
        int z = 100000;
        for (int i = 0; i < n; i++) {
            if (t[i] == 1) {
                y = Math.min(y, c[i]);
            } else if (t[i] == 2) {
                x = Math.min(x, c[i]);
            } else if (t[i] == 3) {
                z = Math.min(z, c[i]);
            }
        }
        int minTotalCost = Math.min(y + x, z);
        if (minTotalCost == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(minTotalCost);
        }
    }
}