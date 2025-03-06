class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;
        for(int i=0 ;i<n-1;i++){
            for (int j = i + 1; j <n; j++){
                int a = 0;
                for (int k = i; k< j;k++){
                    a ^= arr[k];
                }
                int b = 0;
                for (int k = j ;k <n;k++){
                    b ^= arr[k];
                    if (a == b)
                        count++;
                }
            }
        }
        return count;

    }
}