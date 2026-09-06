import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t--> 0) {
            int g = sc.nextInt();
            
            while(g-- > 0){
                int i = sc.nextInt();
                int n = sc.nextInt();
                int q = sc.nextInt();
                
                int res;
                
                if(n % 2 == 0){
                    res = (n / 2);
                } else {
                    if(i == q){
                        res = (n / 2);
                    } else {
                        res = (n / 2) + 1;
                    }
                }
                
                System.out.println(res);
            }
        }
	}
}