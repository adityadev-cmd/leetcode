class Solution {
    public List<Integer> partitionLabels(String s) {
        ///map
        //count
        int count [] = new int[26];
        Arrays.fill(count,0);
        int n = s.length();
        for (int i = 0; i< n ;i ++){
            char ch = s.charAt(i);
            count[ch - 'a'] = i;
        }
        List<Integer> ans = new ArrayList<>();
        // for (Character ch : s.toCharArray()){
        //     if (count[ch - 'a'] > 0 ){
        //         count[ch-'a'] --;
        //         i ++;
        //     }
        //     else {
        //         ans.add(i);
        //         i=1 ;
        //     }
        // }
        
        int i = 0;
        while(i < n ){
            char ch = s.charAt(i);
            int end = count[ch - 'a'];

            int j = i;
            while( j < end){
                char ch1 = s.charAt(j);
                end = Math.max(end , count[ch1 - 'a'] );
                j ++;
            }
            ans.add(j-i+1);
            i = j + 1;
        }
       
        // for (int i = 1; i < n;i++){
        //     char ch = s.charAt(i);
        //     if (end > i && count[ch - 'a']  < end){
        //         i++;
        //     }
        //     else {
        //         ans.add(end);
        //         end = count[ch - 'a'];
        //     }
        // }
        return ans;
    }
}