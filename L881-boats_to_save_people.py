# https://leetcode.com/problems/boats-to-save-people/
class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        length = len(people)
        l, r = 0, length - 1
        boat = 0
        while (l <= r):
            if (people[l] + people[r] <= limit):
                boat += 1
                l += 1
            else:
                boat += 1
            r -= 1
        return boat
