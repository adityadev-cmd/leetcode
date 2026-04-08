class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1000000007;
        for (int[] q : queries){
            int start = q[0];
            int end = q[1];
            int k = q[2];
            int v = q[3];

            while(start <= end){
                nums[start] = (int)((1L * nums[start] * v) % mod);
                start= start + k;
            }
        }
        int xorsum = nums[0];
        for (int i = 1; i < nums.length ;i ++){
                xorsum = xorsum^nums[i];
        }
        return xorsum;
    }
}