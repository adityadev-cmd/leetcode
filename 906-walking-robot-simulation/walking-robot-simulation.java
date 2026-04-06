class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> blocked = new HashSet<>();
        for (int [] o: obstacles){
            blocked.add(o[0] + "," + o[1]);
        }
        // north = 0
        // east = 1 
        // west = 3
        // south = 2
        int [][] direction = {
            {0,1},{1,0},{0,-1},{-1,0}
        };
        int maxDist = 0;
        int x = 0, y = 0;
        int dir = 0 ;
        for (int cmd : commands){
            if (cmd == -1){
                 dir = (dir + 1)%4;
            }
            else if (cmd == -2){
                dir = (dir + 3)%4;
            }
            else {
                while(cmd -- > 0){

                    int nx = x + direction[dir][0];
                    int ny = y + direction[dir][1];


                    if (blocked.contains(nx + "," + ny)) break;
                    x = nx;
                    y = ny;
                    maxDist = Math.max(maxDist,x*x + y*y);
                }
            }
        }
        return maxDist;

    }
}