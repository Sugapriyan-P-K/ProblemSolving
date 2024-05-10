// https://leetcode.com/problems/k-th-smallest-prime-fraction/
class Solution:
    def kthSmallestPrimeFraction(self, arr: List[int], k: int) -> List[int]:
        n = len(arr)
        left, right = 0, 1
        while (left < right):
            mid = (left + right) / 2
            totalSmallerFractions = 0
            numeratorIdx, denominatorIdx = 0, 1
            maxFractions = 0
            j = 1
            for i in range(n):
                while (j < n and arr[i] >= mid * arr[j]):
                    j += 1
                totalSmallerFractions += (n - j)
                if (j == n):
                    break
                fraction = arr[i] / arr[j]
                if (fraction > maxFractions):
                    numeratorIdx = i
                    denominatorIdx = j
                    maxFractions = fraction
            if (totalSmallerFractions == k):
                return [arr[numeratorIdx], arr[denominatorIdx]]
            elif (totalSmallerFractions > k):
                right = mid
            else:
                left = mid
        return []
