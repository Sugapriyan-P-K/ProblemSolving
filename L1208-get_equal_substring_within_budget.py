# https://leetcode.com/problems/get-equal-substrings-within-budget/
class Solution:
    def equalSubstring(self, s: str, t: str, maxCost: int) -> int:
        l = 0
        length = len(s)
        for r in range(length):
            maxCost -= abs(ord(s[r])-ord(t[r]))
            if maxCost < 0:
                maxCost += abs(ord(s[l])-ord(t[l]))
                l += 1
        return length - l
