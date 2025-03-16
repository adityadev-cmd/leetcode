class Solution {
    public boolean timeStuff(int [] ranks , int cars, long minGiven){
        long carsDone = 0;
        for (int r : ranks){
            long c2 = minGiven/r;
            long c = (long)Math.sqrt(c2);
            carsDone += c; 
        }
        return carsDone >= cars;
    }
    public long repairCars(int[] ranks, int cars) {
        long start = 1, end= (long)1e14;

        while(start < end){
            long mid = (start + end)/2;
            if (timeStuff(ranks,cars,mid)){
                end = mid ;
            }
            else start = mid + 1;
        }
        return start;
    }
}