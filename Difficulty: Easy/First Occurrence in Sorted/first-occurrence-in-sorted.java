class Solution
{
    public int firstSearch(int[] arr,int k)
    {
        int l=0,r=arr.length-1;
        int ans=-1;
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==k)
            {
                ans=mid;
                r=mid-1;
            }
            else if(arr[mid]<k)
                l=mid+1;
            else
                r=mid-1;
        }
        return ans;
    }
}