import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextInt();
            }
       int ans = 0, cur = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > 0 && b[i] > 0) cur++;
                else cur = 0;
                ans = Math.max(ans, cur);
            }
            System.out.println(ans);
        }
    }
}