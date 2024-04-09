// https://leetcode.com/problems/time-needed-to-buy-tickets/

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int length = tickets.length;
        int res = 0;
        while (tickets[k] != 0) {
            for (int i = 0; i < length; i++) {
                if (tickets[i] == 0) {
                    continue;
                }
                if (tickets[k] == 0) {
                    return res;
                }
                tickets[i] -= 1;
                res += 1;
            }
        }
        return res;
    }
    public int timeRequiredToBuy2(int[] tickets, int k) {
        int time = 0;
        
        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[k], tickets[i]);
            } else {
                time += Math.min(tickets[k] - 1, tickets[i]);
            }
        }
        
        return time;
    }
}
