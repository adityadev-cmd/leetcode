class Solution {
    public static Boolean isOutOfBound(int row, int col,int[][] grid ){
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length)
        return true;
        return false;
    }
    public static Integer maxCherries(int r, int r1Col,int r2Col,HashMap<String,Integer>memo, int[][] grid){

        if (isOutOfBound(r,r1Col,grid) ||isOutOfBound(r,r2Col,grid) ){
            return 0;
        }
        String key = r + "," + r1Col + "," + r2Col;
        if (memo.containsKey(key)){
            return memo.get(key);
        }

        int score = grid[r][r1Col];
        if (r1Col != r2Col){
            score += grid[r][r2Col];
        }
        int []r1moves = {r1Col,r1Col+1,r1Col-1};
        int []r2moves = {r2Col,r2Col+1,r2Col-1};
        int maxScore =0;
        for (int rob1 : r1moves){
            for (int rob2 : r2moves){
                int currentscore = score + maxCherries(r + 1 , rob1,rob2,memo,grid);
                maxScore = Math.max(maxScore,currentscore);
            }
        }
        memo.put(key,maxScore);
        return maxScore;
    }
    public int cherryPickup(int[][] grid) {
        HashMap<String,Integer> memo = new HashMap<>();
        return maxCherries(0,0,grid[0].length - 1,memo,grid);
       
    }
}