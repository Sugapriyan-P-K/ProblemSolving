public class BagOfTokens {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l = 0, r = tokens.length - 1, score = 0, maxScore = 0;
        while (l <= r) {
            if (tokens[l] <= power) {
                power -= tokens[l];
                score++;
                l++;
                maxScore = Math.max(maxScore, score);
            } else if (score > 0) {
                power += tokens[r];
                score--;
                r--;
            } else {
                break;
            }

        }
        return maxScore;
    }
  // https://leetcode.com/problems/bag-of-tokens/
}
