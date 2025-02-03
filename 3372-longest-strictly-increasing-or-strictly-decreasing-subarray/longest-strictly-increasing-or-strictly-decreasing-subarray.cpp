class Solution {
public:
    int longestMonotonicSubarray(vector<int>& nums) {
        int n = nums.size();
        int maxLen = 1;
        int dec = 1;
        int count = 1;
        // check max len for incrreasing
        for (int i=1;i<n;i++){
            if (nums[i] > nums[i-1]){
                count ++; dec = 1;
            }
            else if (nums[i] < nums[i-1]){
                count =1 ; dec ++;
            }
            else {
                count = 1; dec = 1;
            }
            maxLen = max(maxLen,max(count,dec));
        }
        return maxLen;
    }
};