class Solution {
public:
    bool check(vector<int>& nums) {
        int n = nums.size();
        // count number of inversion where nums[i] > nums[i+!]
        int count = 0;
        for (int i =0 ;i < n ;i ++){
            if (nums[i] > nums[(i+1)%n]){
                count ++;
            }
        }
        if (count> 1)
        return false;
        return true;
        
    }
};