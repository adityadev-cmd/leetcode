class Solution {
    int findDays(int[] weights, int capacity){
        // find the days which will satify the capacity
        int n = weights.length;
        int days = 1;
        int sumDays = 0;
        for (int i = 0 ;i < n ;i ++){
            if (sumDays + weights[i] <= capacity){
                sumDays += weights[i];
            }
            else {
                sumDays = 0;
                days ++;
                sumDays += weights[i];
            }
        }
        // if (sumDays > 0 )
        //     days ++;
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int maxVal = 0;
        int sum = 0;
        for (int i = 0 ;i < n; i++){
            //find sum and max value
            sum += weights[i];
            maxVal = Math.max(maxVal,weights[i]);
        }

        int low = maxVal;
        int high = sum;
        int ans = 0;
        while(low <= high){
            int capacity = low + (high - low)/2 ;
            int capacityDays = findDays(weights,capacity);
            System.out.println("Days getting" + capacityDays + "capacity = " + capacity);
            // if (days == capacityDays)
            //      return capacity;
            if (days >= capacityDays){
                high = capacity -1;
            } 
            else low = capacity + 1;
        }
        return low;

    }
}