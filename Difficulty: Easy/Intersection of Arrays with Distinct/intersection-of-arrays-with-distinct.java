import java.util.*;

class Solution {
    public int intersectSize(int[] a, int[] b) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++)
            set.add(a[i]);
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            if(set.contains(b[i]))
                count++;
        }
        return count;
    }
}