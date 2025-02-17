class Solution {
    public int subarraySum(int[] nums, int k) {
        // total number of subarrays
        // prefix sum
        int n = nums.length;
        int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int tot=0;

        for (int num : nums){
            tot += num;
            if (map.containsKey(tot -k)){
                count += map.get(tot - k);
            }
            map.put(tot,map.getOrDefault(tot,0) + 1);
        }
        return count;

    }
}