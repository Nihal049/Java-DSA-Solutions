import java.util.*;
class Solution {
    public boolean makePalindrome(String[] arr) {
        HashMap<String,Integer> map = new HashMap<>();
        for(String s : arr) {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int odd = 0;
        for(String s : map.keySet()) {
            String rev = new StringBuilder(s).reverse().toString();
            if(s.equals(rev)) {
                if(map.get(s) % 2 != 0)
                    odd++;
            } else {
                if(!map.get(s).equals(map.getOrDefault(rev,0)))
                    return false;
            }
        }
        if(arr.length % 2 == 0)
            return odd == 0;
        return odd == 1;
    }
}