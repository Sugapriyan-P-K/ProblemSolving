# https://leetcode.com/problems/group-anagrams/
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        groupAnagram = defaultdict(list)
        forIndex = ord('a')
        for word in strs:
            count = [0] * 26
            for ch in word:
                count[ord(ch) - forIndex] += 1
            groupAnagram[tuple(count)].append(word)
        return groupAnagram.values()
