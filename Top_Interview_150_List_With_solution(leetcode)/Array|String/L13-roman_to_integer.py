# https://leetcode.com/problems/roman-to-integer/
class Solution:
    def romanToInt(self, s: str) -> int:
        romanLetters = {"I" : 1, "V" : 5, "X" : 10, "L" : 50, "C" : 100, "D" : 500, "M" : 1000, "IV" : 4, "IX" : 9, "XL" : 40, "XC" : 90, "CD" : 400, "CM" : 900}
        val = 0
        i = 0
        c=""
        while i < len(s):
            if i < len(s)-1:
                c = s[i] + s[i+1]
            if c in romanLetters.keys():
                val += romanLetters[c]
                i+=2
            else:
                val += romanLetters[s[i]]
                i+=1
            c = ""
        return val
