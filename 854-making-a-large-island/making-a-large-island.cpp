class Disjointset {
public:
    vector<int>parent , size ;
    Disjointset(int n){
        parent.resize(n+1);
        size.resize(n+1);
        for (int i =0;i<=n;i++){
            parent[i] = i;
            size[i] = 1;
        }
    }
    int findUpar(int node){
        if (node == parent[node])
        return node;
        return parent[node] = findUpar(parent[node]);
    }
    void unionBysize(int u , int v){
        int ulp_u = findUpar(u);
        int ulp_v = findUpar(v);
        if (ulp_u == ulp_v) return ;
        if (size[ulp_u] < size[ulp_v]){
            parent[ulp_u] = ulp_v;
            size[ulp_v] += size[ulp_u]; 
        }
        else {
            parent[ulp_v] = ulp_u;
            size[ulp_u] += size[ulp_v];
        }
    }
};

class Solution {
public:
    int largestIsland(vector<vector<int>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        Disjointset ds(m*n);

        // make set
        int dr[] = {-1,0,1,0};
        int dc[] = {0,-1,0,1};
        for (int row=0 ;row<n;row++){
            for (int col =0;col<m;col++){
                if (grid[row][col] == 0)continue;
                for (int ind =0;ind <4 ;ind++){
                    int newr = row + dr[ind];
                    int newc = col + dc[ind];

        if (newr >=0 && newr <n && newc >=0 && newc <m && grid[newr][newc]==1){
                        int nodeNo = row * n + col;
                        int adjNodeno = newr *n + newc;
                        ds.unionBysize(nodeNo , adjNodeno);
                    }
                }
            }
        }

        // step 2 
        int mx = 0;
        for (int row =0; row <n ;row ++){
            for (int col =0 ;col <m;col++){
                if (grid[row][col] == 1)continue;
                set<int> components;
                for (int ind =0 ;ind<4;ind++){
                    int newr = row + dr[ind];
                    int newc = col + dc[ind];

                    if (newr>=0 && newr <n && newc >=0 && newc <m){
                        if (grid[newr][newc] == 1){
                            components.insert(ds.findUpar(newr * n + newc));
                        }
                    }
                }
                int sizetotal= 0 ;
                for (auto i : components){
                    sizetotal += ds.size[i];
                }
                mx = max(mx,sizetotal + 1);
            }
        }

        for (int cellNo =0;cellNo < n*n ;cellNo++){
            mx = max(mx,ds.size[ds.findUpar(cellNo)]);
        }
        return mx;
    }
};