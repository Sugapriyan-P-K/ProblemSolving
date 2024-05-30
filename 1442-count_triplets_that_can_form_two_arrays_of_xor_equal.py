# https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
class Solution:
    def countTriplets(self, arr: List[int]) -> int:
        count = 0
        length = len(arr)
        for i in range(length - 1):
            a = 0
            for j in range(i+ 1, length):
                a ^= arr[j - 1]
                b = 0
                for k in range(j, length):
                    b ^= arr[k]
                    if (a == b):
                        count += 1
        return count
                
