// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-xor-equal-to-k/
class Solution {
    public int countBits(int number) {
        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }
    public int minOperations(int[] nums, int k) {
        int xor = 0;
        for (int num: nums) {
            xor ^= num;
        }
        int differenceBit = xor ^ k;
        // flip bit
        return countBits(differenceBit);
    }
}
