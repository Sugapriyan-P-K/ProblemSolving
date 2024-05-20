# https://leetcode.com/problems/longest-common-prefix/
class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ''
        if len(strs) == 1:
            return strs[0]
        for string in range(len(strs)):
            if string == 0 and len(strs) > 1:
                astr = strs[string+1]  
            else: 
                astr = res
            res = ''
            if astr == '':
                    return astr
            for i in range(len(strs[string]) if len(strs[string]) < len(astr) else len(astr)):      
                if strs[string][i] == astr[i]:
                    res += strs[string][i]
                elif strs[string][i] != astr[i]:
                    break
        return res
