// https://leetcode.com/problems/subsets/
class Solution { 
    private static void subset(int i,List<Integer> sub,int len,int[] nums,List<List<Integer>> res){
        if (i >= len) {
            res.add(List.copyOf(sub));
            return;
        }
        sub.add(nums[i]);
        subset(i+1, sub, len, nums, res);
        sub.remove(sub.size() - 1);
        subset(i+1, sub, len, nums, res);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        subset(0, s, nums.length, nums, res);
        return res;
    }
}
