class Solution {
    public List<String> twoEditWords(String[] queries, String[] dictionary) {
        int n = queries.length;
        int m = dictionary.length;
        List<String> res = new ArrayList<>();
        for (String query : queries){
            if (hasMatch(query,dictionary))
            res.add(query);
        }
        return res;
    }
    private boolean hasMatch(String q, String[] dictionary){
        boolean found = false;
        for(String dict : dictionary ){
            int maxdiff = 2;
            for (int i =0 ;i < q.length();i++){
                if (dict.charAt(i) != q.charAt(i)) maxdiff --;

                if (maxdiff <0)
                break;
            }
            if (maxdiff >= 0)return true;
        }
        return false;
    }
}