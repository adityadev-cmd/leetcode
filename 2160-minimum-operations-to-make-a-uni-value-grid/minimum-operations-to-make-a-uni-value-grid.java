class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int arr [] = new int[n * m];
        int sum =0 ,k = 0;
        int rem = grid[0][0] % x ;
        for (int i =0 ;i < n ;i ++){
            for (int j =0 ; j < m ;j ++){
                if (rem != grid[i][j] %x){
                    return -1;
                }
                sum += grid[i][j];
                arr[k++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int newLen = arr.length;
        // for (int i =0 ;i < newLen; i ++){
        //     System.out.println(arr[i]);
        // }
        int operations = 0;
        int prefix =0 ;
        int suffix = sum;
        int res = Integer.MAX_VALUE;
        for (int i = 0; i<newLen;i++ ){
            suffix = suffix - arr[i];
            int left = ((arr[i] * i) - prefix);
            int right = (suffix - (arr[i] * (newLen-i-1)));
            // System.out.println(i+"->"+left+"->"+right);
            operations = (left + right)/x;
            res = Math.min(res,operations);
            prefix += arr[i];
        }
        return res;
    }
}