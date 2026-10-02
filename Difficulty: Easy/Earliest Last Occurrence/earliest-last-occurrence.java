import java.util.*;

class Solution {
    public int earliestLastOcc(int arr[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
            map.put(arr[i],i);
        int ans=arr[0];
        int index=arr.length;
        for(int x:map.keySet())
        {
            if(map.get(x)<index)
            {
                index=map.get(x);
                ans=x;
            }
        }
        return ans;
    }
}