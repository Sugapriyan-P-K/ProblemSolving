# https://leetcode.com/problems/score-of-a-string/

class Solution:
    def scoreOfString(self, s: str) -> int:
        score, length = 0, len(s)
        for i in range(1, length):
            score += abs(ord(s[i]) - ord(s[i - 1]))
        return score
