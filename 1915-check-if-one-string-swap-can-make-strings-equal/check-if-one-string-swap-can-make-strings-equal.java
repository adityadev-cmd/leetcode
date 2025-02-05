class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int i = -1;
        int j = -1;
        int count = 0;

        for (int k = 0 ; k < n ;k ++){
            if (s1.charAt(k) != s2.charAt(k)){
                count ++;
                if (i == -1) i = k;
                else if (j == -1) j = k;
            }
        }
        if (count == 0) return true;
        if (count == 2 && s1.charAt(i) == s2.charAt(j) && s1.charAt(j) == s2.charAt(i)){
            return true;
        }
        return false;
    }
}