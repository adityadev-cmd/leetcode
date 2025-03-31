class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = wordDict.size();
        Set<String> st = new HashSet<>();

        for (String ss : wordDict){
            st.add(ss);
        }
        
        Boolean arr[] = new Boolean[s.length() + 1];
        return solve(0,st,arr,wordDict,s);
    }
    Boolean solve(int index , Set<String> st,Boolean arr[],List<String> wordDict, String s){
        if (index ==s.length() ){
            return true;
        }

        if (arr[index]!=null){
            return arr[index];
        }
        for (int endIdx = index + 1;endIdx <= s.length() ; endIdx++){
            String split = s.substring(index,endIdx);
            if (st.contains(split) && solve(endIdx , st,arr,wordDict, s))
            return arr[index] = true;
        }
        return arr[index] = false;
    }
}