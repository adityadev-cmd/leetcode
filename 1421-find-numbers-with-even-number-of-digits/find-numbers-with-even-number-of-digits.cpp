class Solution {
public:
    int findNumbers(vector<int>& nums) {
        int n = nums.size();

        int evenCount = 0;
        for (int i =0 ;i < n;i ++){
            int n = nums[i];
            int r =0;
            while(n>0){
                r++;
                n = n/10;
            }
            if (r%2==0) evenCount ++;
        }
        return evenCount;
    }
};