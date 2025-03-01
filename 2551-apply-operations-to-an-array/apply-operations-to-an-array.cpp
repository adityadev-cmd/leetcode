class Solution {
public:
    vector<int> applyOperations(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n,0);
        int count = 0;
        for (int i = 0; i<n - 1;i ++){
            if (nums[i] == nums[i+1]){
                nums[i] = nums[i]*2;
                nums[i + 1] = 0;
                count ++;
            }
        }
        int index = 0;
        for (int i = 0 ;i < n;i++){
            if (nums[i] >0){
               nums[index++] = nums[i]; 
            }
        }
        for (int i = index ; i < n; i++){
            nums[i] = 0;
        }
        return nums;
    }
};