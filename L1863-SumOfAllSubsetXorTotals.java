// https://leetcode.com/problems/sum-of-all-subset-xor-totals/
class Solution {
    public static void dfs(int i, int[] nums, int length, List<Integer> res, List<Integer> subset) {
        if (i >= length) {
            int r = 0;
            for (int num: subset) {
                r ^= num;
            }
            res.add(r);
            return;
        }
        subset.add(nums[i]);
        dfs(i + 1, nums, length, res, subset);
        
        subset.remove(subset.size() - 1);
        dfs(i + 1, nums, length, res, subset);
    }
    public int subsetXORSum(int[] nums) {
        List<Integer> res = new ArrayList<>();
        dfs(0, nums, nums.length, res, new ArrayList<>());
        int result = 0;
        for (int num: res) {
            result += num;
        }
        return result;
    }
}
