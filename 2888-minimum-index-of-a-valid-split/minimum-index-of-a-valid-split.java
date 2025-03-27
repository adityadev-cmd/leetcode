class Solution {
    public int minimumIndex(List<Integer> nums) {
        int n = nums.size();
        int mE = nums.get(0);
        int freq = 1;
        int ans = -1;
        for (int i =1 ;i < n ;i ++){
            if (mE == nums.get(i)){
                freq ++;
            }
            else {
                freq --;
                if (freq == 0){
                    mE = nums.get(i);
                    freq = 1;
                }
            }
        }
        freq  = 0 ;
        for (int i = 0;i < n ;i ++){
            if (nums.get(i) == mE){
                freq ++;
            }
        }
        System.out.println("mE " + mE + " " + freq );
        int currFreq = 0;
        for (int i =0 ;i < n-1 ;i ++){
            if (nums.get(i) == mE){
                currFreq ++;
                int left = (i + 1)/2;
                int right = (n-i-1)/2;
                if (currFreq > left && (freq - currFreq) > right){
                    return i;
                }
            }
        }
        return ans;

    }
}