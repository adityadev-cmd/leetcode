class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int strLen = encodedText.length();
        int col = strLen/rows;

        StringBuilder res = new StringBuilder();
        int count = 0;
        for (int i = 0 ;i < col ; i++){
            count = i;
            while(count < strLen){
                res.append(encodedText.charAt(count));
                count = count + col + 1;
            }
        }
        int pos = 0;
        int end = res.length() - 1;
        while(end >=0 && res.charAt(end) == ' '){
            end --;
        }
        return res.substring(0,end+1);
    }
}