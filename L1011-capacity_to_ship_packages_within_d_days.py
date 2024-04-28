# https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
class Solution:
    def getMaxAndSum(self, arr: List[int], length: int) -> List[int]:
        s, m = 0 ,0
        for num in arr:
            s += num
            if (m < num):
                m = num
        return [m, s]
    
    def getDays(self, weights: List[int], length: int, capacity: int) -> int:
        days, load = 1, 0
        for weight in weights:
            if (load + weight > capacity):
                days = days + 1
                load = weight
            else:
                load += weight
        return days
    
    def shipWithinDays(self, weights: List[int], days: int) -> int:
        length = len(weights)
        t = self.getMaxAndSum(weights, length)
        low, high = t[0], t[1]
        while (low <= high):
            mid = (low + high) // 2
            day = self.getDays(weights, length, mid)
            if (day <= days):
                high = mid - 1
            else:
                low = mid + 1
        return low
        
