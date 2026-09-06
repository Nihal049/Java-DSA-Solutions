import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for (int cas = 0; cas < cases; cas++) {
            String s = sc.next();
            int total = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if ('0' <= ch && ch <= '9') {
                    total += ch - '0';
                }
            }
            System.out.println(total);
        }
    }
}