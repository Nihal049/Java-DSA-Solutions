class Solution {
    public String timeGap(String st, String et) {
        int start = toSeconds(st);
        int end = toSeconds(et);
        int diff = end - start;

        int h = diff / 3600;
        int m = (diff % 3600) / 60;
        int s = diff % 60;

        return String.format("%02d:%02d:%02d", h, m, s);
    }

    private int toSeconds(String t) {
        String[] parts = t.split(":");
        int h = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int s = Integer.parseInt(parts[2]);
        return h * 3600 + m * 60 + s;
    }
}