class Solution {
public:
    vector<int> findEvenNumbers(vector<int>& digits) {
        vector<int> map(10,0);
        for (int num : digits){
            map[num] ++;
        }

        vector<int>res;
        for (int i =1 ;i<=9;i++){
            if (map[i] == 0) continue;
            map[i]--;

            for (int j =0 ;j <=9 ;j++){
                if (map[j] == 0) continue;
                map[j]--;

                for (int k = 0; k<=8 ;k += 2){
                    if (map[k] == 0) continue;
                    res.push_back(i * 100 + j* 10 + k);
                }
                map[j] ++;
            }
            map[i]++;
        }
        return res;
    }
};