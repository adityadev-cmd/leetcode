class Solution {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int sum = nums[0];
        for (int i =1 ;i<n;i++){
            if (nums[i-1] < nums[i] ){
                sum += nums[i];
                maxSum = Math.max(maxSum, sum);
            }
            else {
                sum = nums[i];
            }
           
        }
        return maxSum;
    }
}