// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/
class Solution {
    public boolean isSubString(String s, String t, int p, int length, int sLen) {
        if (sLen - p < length) {
            return false;
        }
        for (int i = 0; i < length && p < sLen; i++,p++) {
            if (s.charAt(p) != t.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length(), stackLength = haystack.length();
        if (needleLength > stackLength) {
            return -1;
        }
        int l = 0, r = 0, p = 0;
        for (; r < stackLength; r++) {
            if (isSubString(haystack, needle, r, needleLength, stackLength)) {
                return r;
            }
        }
        return -1;
    }
}
