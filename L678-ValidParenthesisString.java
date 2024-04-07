// https://leetcode.com/problems/valid-parenthesis-string/
class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        Stack<Integer> starStack = new Stack<Integer>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else if (s.charAt(i) == '*') {
                starStack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else if (!starStack.isEmpty()) {
                    starStack.pop();
                } else {
                    return false;
                }
            }
        }
        while (!stack.isEmpty() && !starStack.isEmpty()) {
            if (stack.pop() > starStack.pop()) {
                return false;
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }
        return true;
    }
}
