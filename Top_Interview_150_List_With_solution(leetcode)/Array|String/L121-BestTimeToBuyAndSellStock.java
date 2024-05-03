// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
class Solution {
    public int maxProfit(int[] prices) {
        int l = 0,
            r = 1,
            maxPro = 0,
            profit = 0,
            totLen = prices.length;
        while (r < totLen) {
            if (prices[l] < prices[r]){
                profit = prices[r] - prices[l];
                maxPro = maxPro>profit ? maxPro : profit;
            }
            else {
                l = r;
            }
            r++;
        }
        return maxPro;
    }
}
