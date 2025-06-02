class Solution {
public:
    int candy(vector<int>& ratings) {
        // using maxima and minima approach
        int n = ratings.size();
        vector<int>candies(n,1);
        for (int i  = 1; i <n;i++){
            if (ratings[i] > ratings[i-1])
              candies[i] = max(candies[i] , candies[i-1] + 1);
        }

        for (int i = n-2 ;i >=0 ;i --){
          if (ratings[i] > ratings[i+1]){
            candies[i]= max(candies[i+1]+1 , candies[i]);
          }
        }
        int sum = 0;
        for (auto i : candies)
          sum += i;

        return sum;
    }
};