class Solution {
    private static final int mod = 1_000_000_007;
    private long power(long base, long exp){
        long res = 1;
        base %= mod;
        while(exp > 0){
            if ((exp &1) == 1) res = (res * base) %mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return res;
    }
    private long modInv(long n ){
        return power(n, mod - 2);
    }
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1000000007;
        int n = nums.length;
        int limit = (int) Math.sqrt(n);
        Map<Integer,List<int[]>> lightK = new HashMap<>();
        for(int []q : queries){
            int l = q[0], r = q[1], k = q[2], v= q[3];

            if (k >= limit){
                //large k brute force
                for (int i = l ;i <= r ; i = i + k){
                    nums[i] = (int) ((1L * nums[i] * v)%mod);
                }
            }
            else {
                // small k: process later
                lightK.computeIfAbsent(k, x -> new ArrayList<>()).add(q);
            }
        }

        for (Map.Entry<Integer,List<int[]>> entry : lightK.entrySet()){
            int k = entry.getKey();
            List<int[]> queryList = entry.getValue();

            long [] diff = new long[n];
            Arrays.fill(diff,1L);

            for (int []q : queryList){
                int l = q[0], r = q[1], v = q[3];

                // multiply starting position
                diff[l] = (diff[l] * v) %mod;

                ///cancel the multiplication with a tep zixe of k
                int steps = (r-l)/k;
                int next = l + (steps + 1) * k;
                if (next < n){
                    diff[next] = (diff[next] * modInv(v)) %mod;
                }
            }

        for (int i =0; i<n;i++){
            if (i >=k){
                diff[i] = (diff[i] * diff[i-k]) %mod;
            }
            nums[i] = (int)((1L * nums[i] * diff[i]) % mod);
        }
        }
        long ans = nums[0];
        for (int i = 1 ; i < n ;i ++){
            ans^= nums[i];
        }
        return (int)ans;
        
    }
}