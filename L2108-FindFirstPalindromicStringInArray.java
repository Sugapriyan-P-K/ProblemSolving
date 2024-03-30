// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/
class Solution {
    public boolean isPalindrome(String word) {
        int left = 0, right = word.length() - 1;
        for (;left < right; left++, right--) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        int length = words.length;
        for (int index = 0; index < length; index++) {
            if (isPalindrome(words[index]))
                return words[index];
        }
        return "";
    }
}
