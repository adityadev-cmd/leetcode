class Solution {
    public long mostPoints(int[][] questions) {
        int questionLen = questions.length;
        long dp[] = new long[questionLen + 1];

        for (int i = questionLen - 1 ; i>= 0; i--){
            int index = i + questions[i][1] + 1;

            if (index > questionLen){
                dp[i] = questions[i][0];
            }
            else {
                dp[i] = (questions[i][0] + dp[index]);
            }

            if (i < questionLen - 1){
                dp[i] = Math.max(dp[i],dp[i+1]);
            }
        }
        return dp[0];
    }
}