class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        Set<String> st = new HashSet<>();
        for (int i = 0; i < supplies.length; i++) {
            st.add(supplies[i]);
        }
        List<String> ans = new ArrayList<>();
        int n = recipes.length;
        boolean flag[] = new boolean[n];
        Arrays.fill(flag,false);
        int count = n;
        while (count > 0 ) {
            count--;
            for (int i = 0; i < n; i++) {
                if (flag[i]) { 
                    continue;
                    }
                        boolean flag1 = true;
                        for (int j = 0; j < ingredients.get(i).size(); j++) {
                            if (!st.contains(ingredients.get(i).get(j))) {
                                flag1 = false;
                                break;
                            }
                        }

                        if (flag1) {
                            ans.add(recipes[i]);
                            st.add(recipes[i]);
                            flag[i] = true;
                        }
                    
            }
        }
        return ans;

    }
}