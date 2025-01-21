class Solution {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;
        long rowA = 0;

        for (int i =0;i<n;i++){
            rowA += grid[0][i];
        }
        long rowB = 0;
        long res = Long.MAX_VALUE;
        for (int i = 0 ;i < n;i++){
            rowA -= grid[0][i];
            res = Math.min( res,Math.max(rowA,rowB));
            rowB += grid[1][i];
        }
        return res;
    }
}