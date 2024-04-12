// https://leetcode.com/problems/group-anagrams/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs.length == 0) return res;
        Map<String, List<String>> groupAnagram = new HashMap<>();
        for(String word: strs) {
            int[] count = new int[26];
            int wordLen = word.length();
            for(int i = 0; i < wordLen; i++) {
                count[word.charAt(i) - 'a'] += 1;
            }
            String key = new String(Arrays.toString(count));
            groupAnagram.computeIfAbsent(key, k -> new ArrayList<>());
            groupAnagram.get(key).add(word);
        }
        res.addAll(groupAnagram.values());
        return res;
    }
}
