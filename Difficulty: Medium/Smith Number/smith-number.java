class Solution {
    public boolean smithNum(int n) {
        if (n <= 3) {
            return false;
        }

        int sumOfDigitsN = 0;
        int tempN = n;
        while (tempN > 0) {
            sumOfDigitsN += tempN % 10;
            tempN /= 10;
        }

        int sumOfDigitsFactors = 0;
        int temp = n;
        boolean isComposite = false;

        for (int i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                isComposite = true;
                int factor = i;
                while (factor > 0) {
                    sumOfDigitsFactors += factor % 10;
                    factor /= 10;
                }
                temp /= i;
            }
        }

        if (temp > 1) {
            if (temp != n) {
                isComposite = true;
            }
            int factor = temp;
            while (factor > 0) {
                sumOfDigitsFactors += factor % 10;
                factor /= 10;
            }
        }

        if (!isComposite) {
            return false;
        }

        return sumOfDigitsN == sumOfDigitsFactors;
    }
}