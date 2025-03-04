class Solution {
    public boolean checkPowersOfThree(int n) {
        // ternary representation
        // divide by 3 and 
        while(n > 0 ){
            if (n%3 ==2)
            return false;

            else n = n/3;
        }
        return true;
    }
}