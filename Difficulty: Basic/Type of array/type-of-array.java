class Solution {
    public int typeOfArr(int[] arr) {
        int n = arr.length;
        int ascBreak = 0;
        int descBreak = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1])
                descBreak++;
            else
                ascBreak++;
        }

        if (ascBreak == 0)
            return 1;

        if (descBreak == 0)
            return 2;

        if (descBreak == 1)
            return 3;

        return 4;
    }
}