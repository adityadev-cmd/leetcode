class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int lesser[] = new int[n];
        int greater[]= new int[n];
        int count =0;
        int j =0 , k = 0;
        for (int i =0 ;i <n; i++){
            if (nums[i] > pivot)
                greater[j++] = (nums[i]);
            else if (nums[i] < pivot)
                lesser[k++] = (nums[i]);
            else 
               count ++;

        }
        int [] result = new int[n];
        int index = 0;
        for (int a = 0; a < k; a++) { result[index++] = lesser[a];}
       for (int a = 0; a < count; a++) {
            result[index++] = pivot;
        }        
        for (int a = 0; a < j; a++) {result[index++] = greater[a];}

        return result;
    }
}