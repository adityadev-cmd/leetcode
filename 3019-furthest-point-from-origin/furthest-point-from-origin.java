class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l = 0, r= 0 , count = 0;
        for (char ch : moves.toCharArray()){
            if (ch == 'L') l++;
            else if (ch == 'R') r++;
            else count ++;
        }
        if (l == r)
            return count;
        else if (l > r)
            return (l-r) + count;
        else 
            return (r-l) + count;
    }
}