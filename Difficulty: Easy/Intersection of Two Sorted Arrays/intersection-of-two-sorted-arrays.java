import java.util.*;

class Solution {
    static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]==b[j])
            {
                if(ans.size()==0||ans.get(ans.size()-1)!=a[i])
                    ans.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j])
                i++;
            else
                j++;
        }
        return ans;
    }
}