// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();
        int length = sb.length();
        for (int i = 0; i < length; i++) {
            if (sb.charAt(i) == '(')
                stack.push(i + 1);
            if (sb.charAt(i) == ')') {
                if (!stack.isEmpty() && stack.peek() >= 0)
                    stack.pop();
                else
                    stack.push(-(i + 1));
            }
        }
        while (!stack.isEmpty()) {
            sb.deleteCharAt(Math.abs(stack.pop()) - 1);
        }
        return sb.toString();
    }
  // brute force
  public String minRemoveToMakeValid2(String s) {
        String res = "";
        int count = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                count += 1;
            }
            if (c == ')') {
                if (count < 1) {
                    continue;
                }
                count -= 1;
            }
            res += c;
        }
        s = res;
        res = "";
        length = s.length();
        count = 0;
        for (int i = length - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ')') {
                count += 1;
            }
            if (c == '(') {
                if (count < 1) {
                    continue;
                }
                count -= 1;
            }
            res = c + res;
        }
        return res;
    }
}
