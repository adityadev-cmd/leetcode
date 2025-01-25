class Solution {
public:
    vector<int> lexicographicallySmallestArray(vector<int>& nums, int limit) {
        vector<pair<int,int>> valueIndexPairs;
        int size = nums.size();

        for(int i= 0 ;i < size; i ++){
            valueIndexPairs.push_back({nums[i],i});
        }

        sort(valueIndexPairs.begin(),valueIndexPairs.end());

        vector<vector<pair<int,int>>> groupedPair;
        groupedPair.push_back({valueIndexPairs[0]});

        for (int i =1 ;i < size; i ++){
            if (valueIndexPairs[i].first - valueIndexPairs[i-1].first <= limit){
                groupedPair.back().push_back(valueIndexPairs[i]);
            }
            else {
                groupedPair.push_back({valueIndexPairs[i]});
            }
        }

        for (const auto& group :groupedPair ){
            vector<int>indices;
            for (const auto& [value,index] : group){
                indices.push_back(index);
            }
            sort(indices.begin(), indices.end());

            for (int i = 0; i < indices.size() ;i ++){
                nums[indices[i]] = group[i].first;
            }
        }
        return nums;
    }
};