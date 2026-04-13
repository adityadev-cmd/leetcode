class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int minn = Integer.MAX_VALUE;
        for (int i =0 ;i < n; i ++){
            if (nums[i] == target){
                minn= Math.min(minn, Math.abs(i-start));
            }
        }
        return minn;
    }
}