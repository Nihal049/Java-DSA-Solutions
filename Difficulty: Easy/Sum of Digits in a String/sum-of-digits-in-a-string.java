import java.util.*;
class Solution {
	public String arrangeString(String s) {
		StringBuilder letters = new StringBuilder();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				letters.append(c);
			} else {
				sum += c - '0';
			}
		}
		char[] a = letters.toString().toCharArray();
		Arrays.sort(a);
		if (sum == 0)
			return new String(a);
		return new String(a) + sum;
	}
}
