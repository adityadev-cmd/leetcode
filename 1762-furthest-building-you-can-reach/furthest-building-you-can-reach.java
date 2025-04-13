class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        /// store the differnce
        int n = heights.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n -1 ; i++){
            int diff = heights[i+1] - heights[i];
            if (diff <=0) continue;

            pq.add(diff);

            if (pq.size() > ladders) bricks -= pq.poll();
            if (bricks <0)return i;
        }
        return n - 1 ;
    }
}