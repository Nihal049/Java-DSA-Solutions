class Solution
{
    public pair[] allPairs(int target, int arr1[], int arr2[])
    {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        ArrayList<pair> ans = new ArrayList<>();
        int i = 0;
        int j = arr2.length - 1;
        while (i < arr1.length && j >= 0)
        {
            int sum = arr1[i] + arr2[j];
            if (sum == target)
            {
                int x = arr1[i];
                int y = arr2[j];
                int c1 = 0;
                int c2 = 0;
                while (i < arr1.length && arr1[i] == x)
                {
                    c1++;
                    i++;
                }
                while (j >= 0 && arr2[j] == y)
                {
                    c2++;
                    j--;
                }
                for (int k = 0; k < c1 * c2; k++)
                    ans.add(new pair(x, y));
            }
            else if (sum < target)
                i++;
            else
                j--;
        }
        return ans.toArray(new pair[0]);
    }
}