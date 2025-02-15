class Solution {
    public boolean canPartition (String nums , int index , int target ){
        if (index == nums.length()) return target == 0;

        int currentSum = 0;
        for (int j = index ; j < nums.length() ; j ++){
            currentSum = currentSum * 10 + (nums.charAt(j) - '0');
            if (currentSum > target) break;
            if (canPartition(nums , j + 1, target - currentSum)){
                return true;
            }

        }
        return false;
    }
    public int punishmentNumber(int n) {
        // generate all squarw numbers
        int countSum = 0;
        for (int i =1 ;i <= n ; i++){
            int squared = i * i;
            // check for sum 
             if (canPartition(String.valueOf(squared), 0, i)) {
                countSum += squared;
            }
        }
        return countSum;
    }
}