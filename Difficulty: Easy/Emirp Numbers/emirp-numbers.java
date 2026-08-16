class Solution {
     public int[] emirpNumbers(int n) {
         boolean[] isPrime = new boolean[n + 1];
         for (int i = 2; i <= n; i++) {
             isPrime[i] = true;
         }
         for (int i = 2; i * i <= n; i++) {
             if (isPrime[i]) {
                 for (int j = i * i; j <= n; j += i) {
                     isPrime[j] = false;
                 }
             }
         }
         java.util.List<Integer> result = new java.util.ArrayList<>();
         for (int num = 13; num <= n; num++) {
             if (isPrime[num]) {
                 int reversed = reverse(num);
                 if (reversed != num && reversed <= n && isPrime[reversed]) {
                     result.add(num);
                 }
             }
         }
         int[] ans = new int[result.size()];
         for (int i = 0; i < result.size(); i++) {
             ans[i] = result.get(i);
         }
         return ans;
     }
     private int reverse(int num) {
         int rev = 0;
         while (num > 0) {
             rev = rev * 10 + num % 10;
             num /= 10;
         }
         return rev;
     }
 }