class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int dp[] = new int[n+1];
        int prev[] = new int[n+1];
        Arrays.sort(nums);
        int maxi =0;
        Arrays.fill(prev ,-1);
        Arrays.fill(dp,1);
        for (int i =0; i< n; i++){
            for (int j = 0; j<i ; j++){
                if (nums[i]%nums[j] ==0 && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[maxi]) maxi = i;
        }
        List<Integer> res = new ArrayList<>();
        for (int i= maxi ;i>=0;i = prev[i]){
            res.add(nums[i]);
        }
        return res;
    }
}