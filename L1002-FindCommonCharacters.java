// https://leetcode.com/problems/find-common-characters/
class Solution {
    public List<String> commonChars(String[] words) {
        int res[] = new int[26], a[] = new int[26];
        int l = words.length;
        List<String> result = new ArrayList<>();
        int l1 = words[0].length();
        for (int i = 0; i < l1; i++) {
            res[words[0].charAt(i) - 'a'] += 1;
        }
        for (int i = 1;i < l; i++) {
            int length = words[i].length();
            for (int j = 0; j < length; j++) {
                a[words[i].charAt(j) - 'a'] += 1;
            }
            for (int j = 0; j < 26; j++) {
                res[j] = Math.min(res[j], a[j]);
                a[j] = 0;
            }
        }
        for (int i = 0; i < 26; i++) {
            while (res[i] > 0) {
                result.add((char) ('a' + i) + "");
                res[i] -= 1;
            }
        }
        return result;
    }
}
