class Solution {
public:
int dirX [4] = {0,-1,1,0};
int dirY [4] = {1,0,0,-1};
    int findMaxFish(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        int maxcount =0 ;
        for (int i =0 ;i < n;i ++){
            for (int j =0 ; j < m ; j++){
                int count =0 ;
                if (grid[i][j] > 0){
                    // count += grid[i][j];
                    // grid[i][j]=0;
                   dfs(i,j,grid,count,n,m);

                  maxcount = max(maxcount,count);
                }
            }
        }
        return maxcount;
    }

    void dfs(int x,int y ,vector<vector<int>>& grid , int &count , int row, int col){
        if (x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 0){
                return ;
        }
         count += grid[x][y];
         cout<<"x-- "<<x<<" "<<"y-- "<<y<<endl;
         grid[x][y] =0;
        for (int dir = 0; dir<4 ; dir ++){
            int newX = x + dirX[dir];
            int newY = y + dirY[dir];
            dfs(newX,newY,grid,count,row,col);
        }
    }
};