# https://leetcode.com/problems/valid-parenthesis-string/
class Solution:
    def checkValidString(self, s: str) -> bool:
        openBrackets = []
        asterisks = []
        length = len(s)
        for i in range(length):
            if (s[i] == '('):
                openBrackets.append(i)
            elif (s[i] == '*'):
                asterisks.append(i)
            else:
                if (openBrackets):
                    openBrackets.pop()
                elif (asterisks):
                    asterisks.pop()
                else:
                    return False
        while (openBrackets and asterisks):
            if (openBrackets.pop() > asterisks.pop()):
                return False
        if (openBrackets):
            return False
        return True
