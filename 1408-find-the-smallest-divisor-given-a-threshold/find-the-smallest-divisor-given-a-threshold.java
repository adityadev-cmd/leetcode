class Solution {
    public boolean findDivisor(int[] nums,int mid , int threshold){
        int val =0;
        for(int i=0;i< nums.length;i++){
            val += Math.ceil((double)nums[i]/mid);
        }
        System.out.println(val);
        return val <= threshold;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;
        int start = 1;
        int maxx =0;
        for(int i=0;i<n;i++){
            maxx = Math.max(maxx, nums[i]);
        }
        int end = maxx;
        int ans = -1;
        while(start <= end){
            int mid = start + (end -start)/2;
            // find divisor
            if (findDivisor(nums, mid, threshold)){
                ans = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return ans;
    }
}