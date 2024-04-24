# https://leetcode.com/problems/n-th-tribonacci-number
class Solution:
    def tribonacci(self, n: int) -> int:
        zero, one, two = 0, 1, 1
        for i in range(n):
            t1 = one
            t2 = two
            two = zero + one + two
            zero = t1
            one = t2
        return zero
