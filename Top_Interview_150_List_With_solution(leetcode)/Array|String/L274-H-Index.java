// https://leetcode.com/problems/h-index/

class Solution {
    public int hIndex(int[] citations) {
        int max = 0, p = citations.length - 1, length = citations.length;
        for (int citation: citations) {
            max = Math.max(max, citation);
        }
        int counts[] = new int[max + 1];
        for (int citation: citations) {
            counts[citation]  += 1;
        }
        for (int i = 0; i <= max; i++) {
            for (int j = 0; j < counts[i]; j++) {
                citations[p--] = i;
            }
        }
        for (int i = length - 1; i >= 0; i--) {
            if (citations[i] >= i + 1) {
                return i + 1;
            }
        }
        return citations[0];
    }
}
