class Solution {
    public long putMarbles(int[] weights, int k) {
        // generate all subarrays - 
        // heaps -> k = 2 , arr[i ... j]
        if (k == 1)
        return 0;
        int n = weights.length;
        List<Integer> pairSum = new ArrayList<>();
        for (int i = 0 ;i < n-1; i ++){
            int val = weights[i] + weights[i + 1];
            pairSum.add(val);
        }
        Collections.sort(pairSum);
        long maxx = 0;
        long minn = 0;
        for (int i =0 ;i < k -1 ;i ++){
            minn +=pairSum.get(i);
            maxx += pairSum.get(pairSum.size() - 1 - i);
        }

        return maxx-minn;

    }
}