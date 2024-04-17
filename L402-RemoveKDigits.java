// https://leetcode.com/problems/remove-k-digits/
class Solution {
    public String removeKdigits(String num, int k) {
        int length = num.length();
        String res = "";
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < length; i++) {
            while (k > 0 && !stack.isEmpty() && num.charAt(i) < stack.peek()) {
                k--;
                stack.pop();
            }
            stack.push(num.charAt(i));
        }
        while (k > 0 && !stack.isEmpty()) {
            stack.pop();
            k--;
        }
        for (char c : stack) {
            if (res.equals("") && c == '0') {
                continue;
            }
            res = res + c;
        }
        return res.equals("") ? "0" : res;
    }
}
