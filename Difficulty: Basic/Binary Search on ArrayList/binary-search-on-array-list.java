class Solution
{
    public static int binarySearchAL(ArrayList<Integer> list,int k)
    {
        int l=0,r=list.size()-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(list.get(mid)==k)
                return mid;
            else if(list.get(mid)<k)
                l=mid+1;
            else
                r=mid-1;
        }
        return -1;
    }
}