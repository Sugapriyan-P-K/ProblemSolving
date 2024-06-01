// https://leetcode.com/problems/score-of-a-string/

class Solution {
    public int scoreOfString(String s) {
        int score = 0, length = s.length();
        for (int i = 1; i < length; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        return score;
    }
}
