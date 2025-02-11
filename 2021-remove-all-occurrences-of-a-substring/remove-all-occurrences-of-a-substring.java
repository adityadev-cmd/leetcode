class Solution {
    public String removeOccurrences(String s, String part) {
        int n = s.length();

        while(s.contains(part)){
            s = s.replaceFirst(part,"");
        }
        return s;

    }
}