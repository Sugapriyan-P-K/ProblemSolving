# https://leetcode.com/problems/valid-palindrome/

class Solution:
    def isPalindrome(self, s: str) -> bool:
        toCheck = string.ascii_lowercase + string.digits
        forwardStr = ""
        reverseStr = ""
        l, r = 0, len(s) - 1
        s = s.lower()
        while (l < len(s) and r > -1):
            if s[l] in toCheck:
                forwardStr += s[l]
            if s[r] in toCheck:
                reverseStr += s[r]
            l += 1
            r -= 1
        return True if forwardStr == reverseStr else False
