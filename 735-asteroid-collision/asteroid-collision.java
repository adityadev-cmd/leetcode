class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n = asteroids.length;
        Stack<Integer> st = new Stack<>();
        for (int num : asteroids){
            if (num > 0){
                st.push(num);
            }else {
                while(!st.isEmpty() && st.peek() > 0 && st.peek() < -num){
                    st.pop();
                }
                if (st.isEmpty() || st.peek() <0)
                    st.push(num);
                
                if (st.peek() == -num){
                    st.pop();
                }
            }

        }

        int ans[] = new int[st.size()];
        if (st.size() == 0)
        return ans;
        int i = st.size()-1;
        while(!st.isEmpty()){
            ans[i--] = st.peek();st.pop();
        }
        return ans;
    }
}