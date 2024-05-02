// https://leetcode.com/problems/majority-element/
class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length, nByTwo = length / 2, elem = nums[0],count = 1;
        for (int i = 1; i < length; i++) {
            if (count == 0) {
                count = 1;
                elem = nums[i];
            } else if (elem == nums[i])
                count++;
            else
                count--;
        }
        count = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == elem)
                count++;
            if (count > nByTwo)
                return elem;
        }
        return -1;
    }
}
