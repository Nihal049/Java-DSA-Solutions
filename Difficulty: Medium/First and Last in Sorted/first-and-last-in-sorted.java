import java.util.*;
class Solution
{
    public ArrayList<Integer> find(int arr[],int x)
    {
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0,r=arr.length-1;
        int first=-1,last=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==x)
            {
                first=mid;
                r=mid-1;
            }
            else if(arr[mid]<x)
                l=mid+1;
            else
                r=mid-1;
        }
        l=0;
        r=arr.length-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==x)
            {
                last=mid;
                l=mid+1;
            }
            else if(arr[mid]<x)
                l=mid+1;
            else
                r=mid-1;
        }
        ans.add(first);
        ans.add(last);
        return ans;
    }
}