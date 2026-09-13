class Solution {
    static String findDay(int Day, int Month, int Year) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(Year, Month - 1, Day);
        String[] days = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        return days[calendar.get(java.util.Calendar.DAY_OF_WEEK) - 1];
    }
}