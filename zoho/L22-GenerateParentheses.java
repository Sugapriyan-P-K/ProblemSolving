// https://leetcode.com/problems/generate-parentheses/
class Solution {
    private static Deque<String> stack = new LinkedList<>();
    private static List<String> res = new ArrayList<>();
    private static void bt(int Open, int Close, int n) {
        if ((Open == Close) && (Open == n) && (Close == n)) {
            res.add(String.join("", stack));
            return;
        }
        if (Open < n) {
            stack.add("(");
            bt(Open + 1, Close, n); 
            stack.removeLast();
        }
        if (Close < Open) {
            stack.add(")");
            bt(Open, Close + 1, n);
            stack.removeLast();
        }
    }
    public List<String> generateParenthesis(int n) {
        bt(0,0,n);
        List<String> res2 = new ArrayList<>(res);
        res.clear();
        return res2;
    }
}
