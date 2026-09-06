import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int maxSum = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    long prod = (long) a[i] * a[j];
                    int sum = 0;
                    long temp = prod;
                    while (temp > 0) {
                        sum += (int) (temp % 10);
                        temp /= 10;
                    }
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }
            }
            System.out.println(maxSum);
        }
    }
}