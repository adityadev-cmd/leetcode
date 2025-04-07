class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for (int i=0;i<n;i++){
            sum += nums[i];
        }
        if (sum%2 ==1 ) return false;

        int tgsum = sum/2;
        boolean dp[] = new boolean[tgsum + 1];
        dp[0] = true;
        for (int num : nums){
            for (int currsum = tgsum ; currsum>= num ; currsum--){
                dp[currsum] = dp[currsum] || dp[currsum -num];
                if (dp[tgsum]) return true;
            }
        }
        return dp[tgsum];

    }
}