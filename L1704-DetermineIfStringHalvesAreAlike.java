// https://leetcode.com/problems/determine-if-string-halves-are-alike/
class Solution {
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
}
    public boolean halvesAreAlike(String s) {
        int length = s.length(), mid = length / 2, l = 0, lCount = 0, rCount = 0;
        while (l < mid) {
            if(isVowel(s.charAt(l)))
               lCount++;
            if (isVowel(s.charAt(l+mid)))
               rCount++;
            l++;
        }
        return lCount == rCount;
    }
}
