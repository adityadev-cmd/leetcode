class Pair implements Comparable<Pair> {
    int first;
    int second;

    Pair(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public int compareTo(Pair other) {
        return Integer.compare(other.second, this.second);
    }
}

class Solution {

    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Pair(speed[i], position[i]));
        }
        Collections.sort(list); // on basis of position
        int prev = -1;
        List<Double> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int speed1 = list.get(i).first;
            int position1 = list.get(i).second;
            Double hr = (target - position1) / (double)speed1;

            if (ans.size() == 0 || ans.get(ans.size() - 1) < hr) {
                ans.add(hr);
            }
        }
        
        return ans.size();
    }
}