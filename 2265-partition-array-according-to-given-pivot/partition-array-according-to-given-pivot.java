class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        ArrayList<Integer> greater = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> lesser = new ArrayList<>();
        for (int i =0 ;i <n; i++){
            if (nums[i] > pivot)
                greater.add(nums[i]);
            else if (nums[i] < pivot)
                lesser.add(nums[i]);
            else 
                equal.add(nums[i]);

        }
        int [] result = new int[n];
        int index = 0;
        for (int num : lesser) result[index++] = num;
        for (int num : equal) result[index++] = num;
        for (int num : greater) result[index++] = num;

        return result;
    }
}