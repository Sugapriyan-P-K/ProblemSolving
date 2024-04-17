# https://leetcode.com/problems/h-index/
class Solution:
    def hIndex(self, citations: List[int]) -> int:
        maxi= max(citations)
        length = len(citations)
        p = length - 1
        counts = [0 for _ in range(maxi + 1)]
        for citation in citations:
            counts[citation] += 1
        for i in range(maxi + 1):
            for count in range(counts[i]):
                citations[p] = i
                p -= 1
        for i in range(length - 1, -1, -1):
            if (citations[i] >= i + 1):
                return i + 1
        return citations[0]
