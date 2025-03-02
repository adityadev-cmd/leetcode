class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        List<int[]> res = new ArrayList<>();
        int i =0 ,j =0;
        while(i < n && j < m){
            int id1 = nums1[i][0];
            int id2 = nums2[j][0];
            if (id1 == id2){
                res.add(new int[]{id1,nums1[i][1] + nums2[j][1]});
                i++;
                j++;
            }
            else if (id1 < id2){
                res.add(new int[] {id1,nums1[i][1]});
                i++;

            }
            else {
                res.add(new int[] {id2,nums2[j][1]});
                j++;
            }
        }

        while(i < n){
            res.add(new int[] {nums1[i][0],nums1[i][1]});
            i ++;
        }
        while( j < m){
            res.add(new int[] {nums2[j][0],nums2[j][1]});
            j++;
        }
        int [][] result = new int[res.size()][2];
        for (int k = 0;k < res.size();k++){
            result[k] = res.get(k);
        } 
        return result;
        
    }
}