// https://leetcode.com/problems/n-th-tribonacci-number
class Solution {
    public int tribonacci(int n) {
        int zero = 0,
            one = 1,
            two = 1,
            t1, t2;
        for (int i = 0; i < n; i++) {
            t1 = one;
            t2 = two;
            two = zero + one + two;
            zero = t1;
            one = t2;
        }
        return zero;
    }
}
