class Solution {
    boolean isSym (int num){
        int len = Integer.toString(num).length();   //2  //4 
        String numStr = Integer.toString(num);
        if (len%2 == 1) return false;

            int leftSum =0 , rightSum = 0; 
            for (int i = 0; i< len/2 ; i ++){
                leftSum += numStr.charAt(i) - '0';
            }
            for (int i = len/2; i< len ; i ++){
                rightSum += numStr.charAt(i) - '0';
            }
            if (leftSum == rightSum)
            return true;
        return false;
    }
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for (int i = low ;i <= high ; i ++){
            if (isSym(i)){
                count ++;
            }
        }
        return count;
    }
}