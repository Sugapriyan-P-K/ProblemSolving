// https://leetcode.com/problems/boats-to-save-people/
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int boats = 0, l = 0, r = people.length - 1;
        Arrays.sort(people);
        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                boats += 1;
                l += 1;
            } else {
                boats += 1;
            }
            r -= 1;
        }
        return boats;
    }
}
