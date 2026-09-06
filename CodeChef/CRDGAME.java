import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {
            int n = sc.nextInt();

            int chef = 0, morty = 0;
            for (int i = 0; i < n; i++) {
                int Ai = sc.nextInt();
                int Bi = sc.nextInt();

                int chefPower = digitSum(Ai);
                int mortyPower = digitSum(Bi);

                if (chefPower > mortyPower) chef++;
                else if (chefPower < mortyPower) morty++;
                else {
                    chef++;
                    morty++;
                }
            }
            
            if(chef > morty){
                System.out.println(0 + " " + chef);
            } else if(morty > chef){
                System.out.println(1 + " " + morty);
            } else{
                System.out.println(2 + " " + chef);
            }
        }
    }

    public static int digitSum(int num) {
        int sum = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }

        return sum;
    }
}