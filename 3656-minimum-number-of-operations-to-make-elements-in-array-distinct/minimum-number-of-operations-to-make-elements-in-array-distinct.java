class Solution {
    public int minimumOperations(int[] nums) {
        int n = nums.length;
        int arr[] = new int[101];
        for (int i = n-1 ; i >=0;i--){
            if ( ++ arr[nums[i]] > 1){
                return (i + 3)/3;
            }
        }
        return 0;
    }
}