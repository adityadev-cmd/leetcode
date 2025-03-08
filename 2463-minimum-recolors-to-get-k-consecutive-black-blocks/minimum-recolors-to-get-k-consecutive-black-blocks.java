class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int maxx = Integer.MAX_VALUE;
        int count = 0;
        for (int i = 0 ;i < n ;i++){
            if (i-k >= 0 && blocks.charAt(i-k) == 'B') count--;
            if (blocks.charAt(i) == 'B') count++;
            maxx = Math.min(maxx, k - count);
        }
        return maxx;
    }
}