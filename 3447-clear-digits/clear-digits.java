class Solution {
    public String clearDigits(String s) {
             StringBuffer stack = new StringBuffer();
        for (char c : s.toCharArray()){
            if (Character.isDigit(c)){
                if (stack.length() >0){
                    stack.deleteCharAt(stack.length() - 1);
                }
            }
            else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}