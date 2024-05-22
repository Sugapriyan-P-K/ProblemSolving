# https://leetcode.com/problems/palindrome-partitioning/
class Solution:
    def isPalindrome(self, s: str) -> bool:
        l, r = 0, len(s) - 1
        while (l <= r):
            if (s[l] != s[r]):
                return False
            l += 1
            r -= 1
        return True
    def bt(self, s: str, dp: List[str], res: List[List[str]]):
        if (s == None or len(s) == 0):
            res.append(dp.copy())
            return
        for i in range(1, len(s) + 1):
            temp = s[0:i]
            if (not self.isPalindrome(temp)):
                continue
            dp.append(temp)
            self.bt(s[i:len(s)], dp, res)
            dp.pop()
    def partition(self, s: str) -> List[List[str]]:
        res = []
        self.bt(s, [], res)
        return res
