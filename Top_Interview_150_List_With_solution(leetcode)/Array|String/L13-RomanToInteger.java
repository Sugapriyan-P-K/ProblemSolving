// https://leetcode.com/problems/roman-to-integer/
class Solution {
    public void fillMap(Map<String, Integer> m) {
        m.put("I", 1);
        m.put("V", 5);
        m.put("X", 10);
        m.put("L", 50);
        m.put("C", 100);
        m.put("D", 500);
        m.put("M", 1000);
        m.put("IV", 4);
        m.put("IX", 9);
        m.put("XL", 40);
        m.put("XC", 90);
        m.put("CD", 400);
        m.put("CM", 900);        
    }
    public int romanToInt(String s) {
        Map<String, Integer> romanToInteger = new HashMap<>();
        int val = 0, i = 0, length = s.length();
        fillMap(romanToInteger);
        while (i < length) {
            String c = "";
            if (i + 1 < length) {
                c = s.charAt(i) + "" + s.charAt(i + 1);
            }
            int t = romanToInteger.getOrDefault(c, 0);
            if (t > 0) {
                val += t;
                i += 2;
            } else {
                val += romanToInteger.getOrDefault(s.charAt(i) + "", 0);
                i += 1;
            }
        }
        return val;
    }
}
