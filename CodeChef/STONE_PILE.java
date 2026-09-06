import java.util.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Deque<Integer> dq = new ArrayDeque<>();
            for (int i = 0; i < N; i++) {
                dq.addLast(sc.nextInt());
            }

            int lastMove = 0;
            while (dq.size() > 1) {
                // Aman's turn: move 1, then move 2
                dq.addLast(dq.removeFirst());
                dq.removeFirst();
                if (dq.size() == 1) {
                    lastMove = 1;
                    break;
                }

                // Akshat's turn: move 1 twice, then move 2
                dq.addLast(dq.removeFirst());
                dq.addLast(dq.removeFirst());
                dq.removeFirst();
                if (dq.size() == 1) {
                    lastMove = 0;
                    break;
                }
            }

            System.out.println(lastMove + " " + dq.peekFirst());
        }
        sc.close();
    }
}