class Solution {
    public int calcDiff(String s) {
        int score = 0;
        int vowels = 0;
        int consonants = 0;
        int consecutive = 0;
        boolean hard = false;
        for(int i = 0; i <= s.length(); i++) {
            if(i == s.length() || s.charAt(i) == ' ') {
                if(vowels + consonants > 0) {
                    if(hard || consonants > vowels)
                        score += 5;
                    else
                        score += 3;
                }
                vowels = 0;
                consonants = 0;
                consecutive = 0;
                hard = false;
            } else {
                char c = s.charAt(i);
                if(c >= 'A' && c <= 'Z')
                    c = (char)(c + 32);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                    consecutive = 0;
                } else {
                    consonants++;
                    consecutive++;
                    if(consecutive >= 4)
                        hard = true;
                }
            }
        }
        return score;
    }
}