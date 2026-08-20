import java.util.*;

class Solution {
    public ArrayList<Integer> getTriangle(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        if (arr == null || arr.length == 0) {
            return result;
        }

        int n = arr.length;
        ArrayList<ArrayList<Integer>> rowsFromBottom = new ArrayList<>();

        ArrayList<Integer> bottomRow = new ArrayList<>();
        for (int num : arr) {
            bottomRow.add(num);
        }
        rowsFromBottom.add(bottomRow);

        ArrayList<Integer> currentRow = bottomRow;
        while (currentRow.size() > 1) {
            ArrayList<Integer> nextRow = new ArrayList<>();
            for (int i = 0; i < currentRow.size() - 1; i++) {
                nextRow.add(currentRow.get(i) + currentRow.get(i + 1));
            }
            rowsFromBottom.add(nextRow);
            currentRow = nextRow;
        }

        for (int i = rowsFromBottom.size() - 1; i >= 0; i--) {
            for (int val : rowsFromBottom.get(i)) {
                result.add(val);
            }
        }

        return result;
    }
}