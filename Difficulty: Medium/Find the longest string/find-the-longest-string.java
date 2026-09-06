class Solution {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }

    public String longestString(String[] words) {
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode cur = root;
            for (int i = 0; i < w.length(); i++) {
                int c = w.charAt(i) - 'a';
                if (cur.children[c] == null) cur.children[c] = new TrieNode();
                cur = cur.children[c];
            }
            cur.isEnd = true;
        }

        String ans = "";
        for (String w : words) {
            if (w.length() < ans.length()) continue;
            TrieNode cur = root;
            boolean ok = true;
            for (int i = 0; i < w.length(); i++) {
                cur = cur.children[w.charAt(i) - 'a'];
                if (cur == null || !cur.isEnd) { ok = false; break; }
            }
            if (ok && (w.length() > ans.length() ||
                    (w.length() == ans.length() && w.compareTo(ans) < 0))) {
                ans = w;
            }
        }
        return ans;
    }
}