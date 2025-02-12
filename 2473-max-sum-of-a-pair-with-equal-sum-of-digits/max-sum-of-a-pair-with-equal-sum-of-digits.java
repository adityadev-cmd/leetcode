class Solution {
    public int sumOfDigits (int n){
        int sum =0 ;
        while(n > 0){
            int r = n%10;
            n = n/10 ;
            sum += r;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> mp = new HashMap<>();
        // sumofdigita,sumofnum
        int maxSum = -1;
        for (int num : nums){
           int digitsSum = sumOfDigits(num);
           if (mp.containsKey(digitsSum)){
            maxSum = Math.max(maxSum, num + mp.get(digitsSum));
           }
     
            mp.put(digitsSum, Math.max(mp.getOrDefault(digitsSum,0),num));

        }
        return maxSum;
    }
}