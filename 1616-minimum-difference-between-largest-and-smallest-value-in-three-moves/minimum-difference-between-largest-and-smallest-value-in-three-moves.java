class Solution {
    public int minDifference(int[] nums) {
        int n = nums.length;
        //get the smallest element
        if (n <=4) return 0;
        Arrays.sort(nums);
        int ans = nums[n-1] - nums[0];
        for (int i= 0; i<=3 ;i ++){
            ans = Math.min(ans, nums[nums.length - (3-i)-1]- nums[i]);
        }
        return ans;
        
    }
}