// https://leetcode.com/problems/jump-game/
class Solution {
    public boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        for (int idx = nums.length - 1; idx > -1; idx--) {
            if (idx + nums[idx] >= goal) {
                goal = idx;
            }
        }
        return goal == 0 ? true : false;
    }
}
