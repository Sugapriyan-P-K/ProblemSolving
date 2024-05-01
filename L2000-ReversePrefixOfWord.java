// https://leetcode.com/problems/reverse-prefix-of-word/
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        if (idx == -1) {
            return word;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (i <= idx) {
                result.append(word.charAt(idx - i));
            }
            else {
                result.append(word.charAt(i));
            }
        }
        return result.toString();
    }
}
