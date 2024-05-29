// https://leetcode.com/problems/get-equal-substrings-within-budget/
class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int length = s.length(), l = 0, maxLen = 0, cur = 0;
        for (int i = 0; i < length; i++) {
            cur += Math.abs(s.charAt(i) - t.charAt(i));
            while (cur > maxCost) {
                cur -= Math.abs(s.charAt(l) - t.charAt(l));
                l += 1;
            }
            maxLen = Math.max(maxLen, i - l + 1);
        }
        return maxLen;
    }
}
