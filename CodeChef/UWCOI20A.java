import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int maximum = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > maximum) {
                    maximum = arr[i];
                }
            }

            System.out.println(maximum);
        }

    }
}