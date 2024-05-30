// https://leetcode.com/problems/is-subsequence/
class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        int subsequence = 0;
        for(int i = 0; i < t.length(); i++) {
            if (subsequence <= s.length() - 1) {
                if (s.charAt(subsequence) == t.charAt(i)) {
                    subsequence += 1;
                }
            }
        }
        return subsequence == s.length() ? true : false;
    }
}
