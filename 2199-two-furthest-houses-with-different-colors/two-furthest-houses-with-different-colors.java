class Solution {
    public int maxDistance(int[] colors) {
        int maxx = 0;
        int num = colors.length;
        int i =0 , j = num - 1;
        while(i < j){
            if (colors[i] == colors[j]) j--;
            else {
                maxx = Math.max(maxx,j-i);
                i++;
            }
        }
        i = 0 ;
        j = num-1;
        while(j > i){
            if (colors[i] == colors[j]) i++;
            else {
                maxx = Math.max(maxx,j-i);
                j--;
            }
        }
        return maxx;

        
    }
}