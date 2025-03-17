class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        int freq[] = new int[501];
        int m = n/2;
        for (int num : nums ){
            freq[num] ++;
        }
        int count =0;
        for (int num : freq){
            if (num > 0 && num%2 ==0){
                count += num/2;
            }
        }
         return (count == m ? true : false);
    }
}