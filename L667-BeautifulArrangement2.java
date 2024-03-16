public class BeautifulArrangement2 {
    public static int[] constructArray(int n, int k) {
        int res[] = new int[n], p = 2, max = Integer.MIN_VALUE;
        res[0] = 1;
        if (n == 1) {
            return res;
        }
        res[1] = 1 + k--;
        max = Math.max(res[1], max);
        while (k > 0) {
            res[p] = p % 2 == 0 ? Math.abs(k - res[p - 1]) : k + res[p - 1];
            max = Math.max(res[p], max);
            p++;
            k--;
        }
        while (p < n) {
            res[p++] = max + 1;
            max++;
        }
        return res;
    }
}
