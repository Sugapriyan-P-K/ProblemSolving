# https://leetcode.com/problems/reverse-words-in-a-string/
class Solution:
    def reverseWords(self, s: str) -> str:
        l = len(s) - 1
        r = l
        res = ""
        while l > -1:
            if s[l] == " " and s[r] == " ":
                l -= 1
                r -= 1
                continue
            if s[l] != " ":
                if l == 0:
                    res += s[l:r+1]
                    res += " "
                    break
                l -= 1
                
            if s[l] == " ":
                res += s[l+1:r+1]
                res += " "
                l -= 1
                r = l
        res = res[0:len(res) - 1]
        return res
