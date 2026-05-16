class Solution {
    public int findMin(int[] nums) {
        //how many times, find the minima
        //binary search [1,3,5]
        // if increasing order a[0], in dec - a[n-1.
        int n = nums.length;
        int left = 0 ,  right = n-1;

        while(left < right){
            int mid = left + (right- left)/2;;

            if(nums[mid] > nums[right]){ left = mid + 1;}
            else if (nums[mid] <  nums[right]) right = mid;
            else right --;

        }
        return nums[left];
    }
}