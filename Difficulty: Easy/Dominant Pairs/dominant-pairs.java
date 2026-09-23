class Solution
{
    public int dominantPairs(int[] arr)
    {
        int n = arr.length / 2;
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++)
        {
            a[i] = arr[i];
            b[i] = arr[i + n];
        }

        Arrays.sort(a);
        Arrays.sort(b);

        int i = n - 1;
        int j = n - 1;
        int count = 0;

        while (i >= 0 && j >= 0)
        {
            if ((long)a[i] >= 5L * b[j])
            {
                count += j + 1;
                i--;
            }
            else
            {
                j--;
            }
        }

        return count;
    }
}