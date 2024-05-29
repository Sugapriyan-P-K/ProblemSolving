// https://leetcode.com/problems/valid-palindrome/
class Solution {
    public boolean isPalindrome(String s) {
        String toCheck = "abcdefghijklmnopqrstuvwxyz0123456789",
        forwardStr = "",
        reverseStr = "";
        int l = 0,
            r = s.length() - 1,
            strLen = s.length();
        // need to lower everything
        s = s.toLowerCase();
        while (l < strLen && r > -1) {
            if (toCheck.indexOf(s.charAt(l)) > -1) {
                forwardStr += s.charAt(l);
            }
            if (toCheck.indexOf(s.charAt(r)) > -1) {
                reverseStr += s.charAt(r);
            }
            l += 1;
            r -= 1;
        }
        boolean res = forwardStr.equals(reverseStr) ? true : false;
        return res;
    }
}
