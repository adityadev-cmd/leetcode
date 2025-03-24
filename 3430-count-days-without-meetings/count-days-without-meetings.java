class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        // sort on basis of starting time
        //merge overlapping intervals
        Arrays.sort(meetings, Comparator.comparingInt(a->a[0]));
        int count = 0;
        // int prevStart = 0;
        int prevEnd = 0;
        for (int i = 0; i<n;i++){
            int start = meetings[i][0];
            int end = meetings[i][1];
            if (prevEnd < start){
                count += start - prevEnd - 1;
            }
            prevEnd = Math.max(prevEnd,end);
        }

        if (days > prevEnd){
            count += days - prevEnd;
        }
        return count;        
    }
}