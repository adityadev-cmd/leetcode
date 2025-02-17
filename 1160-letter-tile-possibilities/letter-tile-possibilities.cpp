class Solution {
public: 
    void fun(string path ,string tiles,set<string>&s){
        if (!path.empty()){
            s.insert(path);
        }
        for (int i = 0 ; i < tiles.size();i++){
            path.push_back(tiles[i]);
            fun(path, tiles.substr(0,i) + tiles.substr(i+1) ,s);
            path.pop_back();
            
        }
    }
    
    int numTilePossibilities(string tiles) {
        // recursion 
        set<string>s;
        fun("",tiles,s);
        return s.size();
        
    }
};