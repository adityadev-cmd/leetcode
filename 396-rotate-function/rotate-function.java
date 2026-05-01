class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        // first time
        int F = 0;
        int sum = 0;
        for (int i =0 ;i < n; i++){
            sum += nums[i];
            F += i*nums[i];  
        }
        int maxx = F;

        for (int i = 1; i<n ;i ++){
            F += sum - n * nums[n-i];
            maxx = Math.max(F,maxx);
        }
        return maxx;
    }
}