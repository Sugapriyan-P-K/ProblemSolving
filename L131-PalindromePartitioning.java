// https://leetcode.com/problems/palindrome-partitioning/
class Solution {
    public Boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l <= r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public void backTrack(String s, List<List<String>> res, List<String> dp) {
        if (s == null || s.length() == 0) {
            res.add(new ArrayList<>(dp));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            String temp = s.substring(0, i);
            if (!isPalindrome(temp)) {
                continue;
            }
            dp.add(temp);
            backTrack(s.substring(i, s.length()), res, dp);
            dp.remove(dp.size() - 1);
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        backTrack(s, res, new ArrayList<>());
        return res;
    }
}
