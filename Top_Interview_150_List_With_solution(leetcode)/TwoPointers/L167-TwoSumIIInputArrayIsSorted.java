// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0,
            r = numbers.length - 1,
            curSum = 0;
        int arr[] = new int[2];
        while (l < r) {
            curSum = numbers[l] + numbers[r];
            if (curSum > target) {
                r -= 1;
            }
            else if (curSum < target) {
                l += 1;
            }
            else {
                arr[0] = l + 1;
                arr[1] = r + 1;
                return arr;
            }
        }
        return arr;
    }
}
