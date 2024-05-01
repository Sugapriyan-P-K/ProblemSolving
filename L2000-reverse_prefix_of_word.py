# https://leetcode.com/problems/reverse-prefix-of-word/
class Solution:
    def getIndex(self, word: str, ch: str):
        try:
            return word.index(ch)
        except:
            return -1
    
    def reversePrefix(self, word: str, ch: str) -> str:
        idx = self.getIndex(word, ch)
        length = len(word)
        res = ""
        for i in range(idx, -1, -1):
            res += word[i]
        for i in range(idx + 1, length):
            res += word[i]
        return res
