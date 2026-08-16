class Solution {
    public long totalFine(int date, int car[], int fine[]) {
        long total = 0;
        boolean dateIsEven = (date % 2 == 0);
        
        for (int i = 0; i < car.length; i++) {
            boolean carIsOdd = (car[i] % 2 != 0);
            if (dateIsEven && carIsOdd) {
                total += fine[i];
            } else if (!dateIsEven && !carIsOdd) {
                total += fine[i];
            }
        }
        return total;
    }
}