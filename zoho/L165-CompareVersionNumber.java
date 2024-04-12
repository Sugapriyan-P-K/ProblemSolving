// https://leetcode.com/problems/compare-version-numbers/

class Solution {
    public int compareVersion(String version1, String version2) {
        int p1 = 0, p2 = 0;
        int num1 = 0, num2 = 0;
        int len1 = version1.length(), len2 = version2.length();
        while (p1 < len1 || p2 < len2) {
            num1 = 0;
            num2 = 0;
            while (p1 < len1 && version1.charAt(p1) != '.') {
                num1 = (num1 * 10 + (version1.charAt(p1) -'0'));
                p1++;
            }
            while (p2 <len2 && version2.charAt(p2) != '.') {
                num2 = (num2 * 10 + (version2.charAt(p2) - '0'));
                p2++;
            }
            if (num1 < num2)
                return -1;
            else if (num1 > num2)
                return 1;
            else {
                p1++;
                p2++;
            }
        }
        return 0;
    }
}
