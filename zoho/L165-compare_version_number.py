# https://leetcode.com/problems/compare-version-numbers/
class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        rev1, rev2 = 0, 0
        p1, p2 = 0, 0
        numVal = ord('0')
        len1, len2 = len(version1), len(version2)
        while (p1 < len1 or p2 < len2):
            rev1, rev2 = 0 , 0
            while (p1 < len1 and version1[p1] != '.'):
                rev1 = (rev1 * 10 + (ord(version1[p1]) - numVal))
                p1 += 1
            while (p2 < len2 and version2[p2] != '.'):
                rev2 = (rev2 * 10 + (ord(version2[p2]) - numVal))
                p2 += 1
            if (rev1 > rev2):
                return 1
            elif (rev2 > rev1):
                return -1
            else:
                p1 += 1
                p2 += 1
        return 0
