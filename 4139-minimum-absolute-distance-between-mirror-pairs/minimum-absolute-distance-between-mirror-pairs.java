class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n = nums.length;
        int ans = n+1;
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i =0;i<n;i++){
            int x = nums[i];
            if (mp.containsKey(x)){
                ans = Math.min(ans, i - mp.get(x));
            }
                mp.put(reverseNum(x),i);
        }
        return ans == n+1 ? -1 : ans;
    }
    private int reverseNum(int x){
        int y = 0;
        while(x>0){
            y = (x%10) + y * 10;
            x = x/10;
        }
        return y;
    }
}