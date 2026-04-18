class Solution {
    public int mirrorDistance(int n) {
        return Math.abs(reverseNum(n) - n);
    }
    private int reverseNum(int n){
        int y = 0;
        while(n > 0){
            y = y *10 + n%10;
            n = n/10;
        }
        return y;
    }
}