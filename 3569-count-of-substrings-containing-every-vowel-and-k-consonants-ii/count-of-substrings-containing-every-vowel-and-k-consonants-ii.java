class Solution {
    public boolean isVowel(char ch){
            return ch == 'a' || ch=='e' || ch=='i'||ch=='o' || ch == 'u';
            
    }
    public long countOfSubstrings(String word, int k) {
        return countcc(word,k) - countcc(word, k+1);
     }
    public long countcc(String word, int k){
        int n = word.length();
        long ans =0 ;
        int consonants =0;
        int left = 0, right = 0;
        HashMap<Character,Integer> vowelMap = new HashMap<>();

        while(right < n){
            char ch= word.charAt(right);
            if (ch == 'a' || ch=='e' || ch=='i'||ch=='o' || ch == 'u'){
                vowelMap.put(ch,vowelMap.getOrDefault(ch,0)+1);
            }
            else {
                consonants++;
            }
            while(vowelMap.size() == 5 && consonants >=k){
                ans += n- right;
                char leftc = word.charAt(left);
                if (isVowel(leftc)){
                    vowelMap.put(leftc, vowelMap.get(leftc) - 1);
                    if (vowelMap.get(leftc) ==0){
                        vowelMap.remove(leftc);
                    }
                }else {
                    consonants --;
                }
                left++;
            }
            right ++;
        }
        return ans;
    }
}