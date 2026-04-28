class Solution {
    public int minOperations(int[][] grid, int x) {
        //check if % should be same if x!=1
        int n = grid.length;
        int m = grid[0].length;
        int N = m*n;
        int [] freq = new int[100001];
        int minn = grid[0][0], maxx = minn;
        for (int row[] : grid){
            for (int val : row){
                if ((val - grid[0][0])%x !=0)
                return -1;
                freq[val] ++;
                minn = Math.min(minn, val);
                maxx = Math.max(maxx,val);
            }
        }

        int target = (N+1)/2;
        int median = minn, acc = 0;

        for (int i = minn;i<=maxx;i = i + x){
            acc += freq[i];
            if (acc >= target){
                median = i;
                break;
            }
        }

        int ops =0;
        for (int i = minn; i<=maxx;i+=x){
            ops += Math.abs(i-median) / x * freq[i];
        }
        return ops;
    }
}