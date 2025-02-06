class Solution {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        int ans= 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        for (int i =0 ;i <n;i++){
            for (int j = i + 1; j < n ;j++){
                int product = nums[i] * nums[j];
                ans += 8 * mp.getOrDefault(product,0);
                mp.put(product,mp.getOrDefault(product,0) + 1);
            }
        }
        return ans;
    }
}