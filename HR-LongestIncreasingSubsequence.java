// https://www.hackerrank.com/challenges/longest-increasing-subsequent/problem
class Result {

    /*
     * Complete the 'longestIncreasingSubsequence' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int longestIncreasingSubsequence(List<Integer> nums) {
    // Write your code here
        int [] dp = new int [nums.size()];
       dp[0]=nums.get(0);
       int incr=1;
       int j =0;

       for(int i =1; i< nums.size();i++) {
           if(nums.get(i)>dp[j]) {
               j=j+1;
               dp[j] = nums.get(i);
               incr++;
           }
           else {
               int ref=j;
               while(ref>=0 && dp[ref]>=nums.get(i)) {
                   ref--;
               }
               dp[ref+1]=nums.get(i);
           }
       } 
       return incr;
    }

}
