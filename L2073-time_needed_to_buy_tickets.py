# https://leetcode.com/problems/time-needed-to-buy-tickets/
class Solution:
    def timeRequiredToBuy(self, tickets: List[int], k: int) -> int:
        length = len(tickets)
        res = 0
        while (tickets[k] != 0):
            for i in range(length):
                if (tickets[i] == 0):
                    t += 1
                    continue
                if (tickets[k] == 0):
                    return res
                tickets[i] -= 1
                res += 1
        return res
    def timeRequiredToBuy2(self, tickets: List[int], k: int) -> int:
        time = 0
        
        for i in range(len(tickets)):
            if i <= k:
                time += min(tickets[k], tickets[i])
            else:
                time += min(tickets[k] - 1, tickets[i])        
        return time
