class Solution {
    public boolean judgeCircle(String moves) {
        int n = moves.length();
        int x = 0, y=0;
        /// L R U D
        for (int i = 0; i<n;i++){
            if (moves.charAt(i) == 'U'){    y = y + 1;}
            else if (moves.charAt(i) == 'D'){    y = y - 1;}
            else if (moves.charAt(i) == 'L'){    x = x - 1;}
            else if (moves.charAt(i) == 'R'){    x = x + 1;}
        }
        if (x == 0 && y == 0)
        return true;
        return false;
    }
}