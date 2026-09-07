import java.util.*;

class Solution {
    public int secFrequent(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }

        int first = 0;
        int second = 0;

        for(int x : map.values()) {
            if(x > first) {
                second = first;
                first = x;
            }
            else if(x > second && x < first) {
                second = x;
            }
        }

        if(second == 0)
            return -1;

        return second;
    }
}