// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
class Solution {
    public int[] getSum(int[] arr, int length) {
        int sum = 0, max = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i];
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return new int[] {max, sum};
    }
    
    public int getDays(int[] weights, int capacity, int length) {
        int days = 1, load = 0;
        for (int i = 0; i < length; i++) {
            if (load + weights[i] > capacity) {
                days = days + 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int length = weights.length;
        int t[] = getSum(weights, length);
        int low = t[0], high = t[1];
        while (low <= high) {
            int mid = (low + high) / 2;
            int day = getDays(weights, mid, length);
            if (day <= days) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
}
