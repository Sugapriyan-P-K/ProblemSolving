// https://leetcode.com/problems/count-triplets-that-can-form-two-arrays-of-equal-xor/
class Solution {
    public int countTriplets(int[] arr) {
        int length = arr.length;
        int count = 0,a = 0, b = 0;
        for (int i = 0; i < length - 1; i++) {
            a = 0;
            for (int j = i + 1; j < length; j++) {
                a ^= arr[j - 1];
                b = 0;
                for (int k = j; k < length; k++) {
                    b ^= arr[k];
                    if (a == b) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}
