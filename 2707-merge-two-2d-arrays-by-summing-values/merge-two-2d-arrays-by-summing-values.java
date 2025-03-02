class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        int n = nums1.length;
        int m = nums2.length;
        for (int i = 0 ;i <n;i++){
            int id = nums1[i][0];
            int val = nums1[i][1];
            mp.put(id,mp.getOrDefault(id,0) + val);
        }
        for (int i = 0 ;i <m;i++){
            int id = nums2[i][0];
            int val = nums2[i][1];
            mp.put(id,mp.getOrDefault(id,0) + val);
        }
        List<int[]> list = new ArrayList<>();
        for (Map.Entry<Integer,Integer>entry: mp.entrySet()){
            list.add(new int[]{entry.getKey(),entry.getValue()});
        }

        list.sort(Comparator.comparingInt(a->a[0]));

        return list.toArray(new int[list.size()][]);
    
    }
}