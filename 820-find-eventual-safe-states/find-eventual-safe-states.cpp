class Solution {
public:
    vector<int> eventualSafeNodes(vector<vector<int>>& graph) {
        int n = graph.size();
        vector<int>indegree(n,0);
        vector<vector<int>> rGraph(n, vector<int>(0));
        for (int u = 0; u< n; u++){
            for (int v : graph[u]){
                rGraph[v].push_back(u);
                indegree[u]++;
            }
        }
        vector<int> ans;
        queue<int> q;
        for (int i =0 ;i < n ;i ++){
            if (indegree[i] == 0){
                q.push(i);
            }
        }

        while(q.size()){
            int u = q.front() ; q.pop();
            ans.push_back(u);

            for (int v : rGraph[u]){
                indegree[v]--;
                if(indegree[v] ==0) q.push(v);
            }
        }
        sort(ans.begin(),ans.end());
        return ans;
    }
};