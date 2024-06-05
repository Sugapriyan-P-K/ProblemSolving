# https://leetcode.com/problems/find-common-characters/
class Solution:
    def commonChars(self, words: List[str]) -> List[str]:
        a = [0 for _ in range(26)]
        res = [0 for _ in range(26)]
        ascii_a = ord('a')
        result = []
        alphabets = string.ascii_lowercase
        length = len(words)
        for letter in words[0]:
            res[ord(letter) - ascii_a] += 1
        for i in range(length):
            for letter in words[i]:
                a[ord(letter) - ascii_a] += 1
            for j in range(26):
                res[j] = min(res[j], a[j])
                a[j] = 0
        for i in range(26):
            while (res[i] > 0):
                result.append(alphabets[i])
                res[i] -= 1
        return result
