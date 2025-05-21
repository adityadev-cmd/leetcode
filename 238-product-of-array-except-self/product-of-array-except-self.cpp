class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        long long product = 1;
        int count =0 ;
        int flag =0;
        for (int i =0 ;i<n;i++){
            if (nums[i] != 0){
                product = product * nums[i];
            }
            else {count ++; flag = 1;}
        }

        if (flag == 1){
        for (int i =0;i<n;i++){
            if (nums[i] ==0 && count >1){
                nums[i] = 0;
            }
            if (nums[i]==0 && count == 1){
                nums[i] = product;
            }
            else nums[i] = 0;
        }
        }
        else {
            for (int i =0 ;i < n ;i ++){
                nums[i] = product/nums[i];
            }
        }

        return nums;
    }
};