class Solution {
public:
    long long minSum(vector<int>& nums1, vector<int>& nums2) {
        int n = nums1.size();
        int m  = nums2.size();
        long count1 = 0 , count2 =0 , sum1 =0  , sum2 = 0;
        //count zeros in nums1;
        for (int i =0 ;i < n; i++){
            if (nums1[i] == 0)
            count1 ++;
            sum1 += nums1[i];
        }
        for (int i =0 ;i < m; i++){
            if (nums2[i] == 0)
            count2 ++;
            sum2 += nums2[i];
        }
        long  minn1 = sum1 + count1;
        long minn2 = sum2 + count2;
        if (count1 == 0 && count2 == 0){
             return sum1 == sum2 ? sum1 : -1;
        }
        else if (count2 ==0){
           return sum1 + count1 <= sum2 ? sum2 : -1;
        }
        else if (count1 == 0){
            return sum2 + count2 <= sum1 ? sum1 : -1;
        }


      return max(minn1, minn2);


    }
};