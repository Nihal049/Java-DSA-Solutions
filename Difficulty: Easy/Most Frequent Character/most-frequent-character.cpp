class Solution {
public:
    char getMaxOccuringChar(string& s) {
        int freq[26] = {};
        for (char c : s)
            freq[c - 'a']++;
        int maxFreq = 0;
        char ans = 'a';
        for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = 'a' + i;
            }
        }
        return ans;
    }
};