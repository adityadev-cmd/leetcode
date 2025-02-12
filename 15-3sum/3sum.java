class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       // 2 sum 
       ArrayList<List<Integer>> ans = new ArrayList<>();
       int n = nums.length;
       Arrays.sort(nums);
       int start = 0 , end = n-1;
       HashSet<List<Integer>> set = new HashSet<>();
       for (int i =0 ; i < n - 2 ;i++){
        start = i + 1 ; end = n-1;
        while(start < end){
            int sum = nums[i] + nums[start] + nums[end];
            if (sum == 0){
                set.add(new ArrayList<>(Arrays.asList(nums[start],nums[i],nums[end])));
                start ++ ;
                end --;
            }
            else if (sum < 0 ){
                start ++;
            }
            else end --;
        }
       }
        ans.addAll(set);
        return ans;
    }
}