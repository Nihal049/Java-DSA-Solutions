import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class NecklaceRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases 

        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            Queue<Integer> necklace = new LinkedList<>();

            // Enqueue the elements (pearls) into the queue
            for (int i = 0; i < n; i++) {
                int pearl = scanner.nextInt();
                necklace.add(pearl);
            }

            // Rotate the queue left by k positions
            for (int i = 0; i < k; i++) {
                int removed = necklace.poll();
                necklace.add(removed);
            }

            // Print the modified necklace
            while (!necklace.isEmpty()) {
                int pearl = necklace.poll();
                System.out.print(pearl + " ");
            }

            System.out.println(); // Move to the next line for the next test case
        }

        scanner.close();
    }
}