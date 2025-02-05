class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();
        int count =0;
        // check for frequency //
        int arr[] = new int[26];
        for (int i = 0; i< n; i ++){
            arr[s1.charAt(i)-'a'] ++;
        }
        for (int i = 0;i <n ; i ++){
            arr[s2.charAt(i) - 'a'] --;
            if (arr[s2.charAt(i) - 'a'] < 0)
               return false;
        }
        for (int i=0;i<n;i++){
            if (s1.charAt(i) != s2.charAt(i)){
                count ++;
            }
        }
        if (count == 2 || count == 0)
        return true;
        return false;
    }
}