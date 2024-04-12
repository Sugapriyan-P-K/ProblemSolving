# https://leetcode.com/problems/generate-parentheses/
class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        stack = []
        res = []
        def bt(Open, Close):
            if Open == Close == n:
                res.append("".join(stack))
                return
            if Open < n:
                stack.append("(")
                bt(Open + 1, Close)
                stack.pop()
            if Close < Open:
                stack.append(")")
                bt(Open, Close + 1)
                stack.pop()
        bt(0,0)
        return res
