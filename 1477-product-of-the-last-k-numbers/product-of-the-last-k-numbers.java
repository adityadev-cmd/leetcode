class ProductOfNumbers {
    private List<Integer> arr ;
    public ProductOfNumbers() {
        // array
        ///dynamic array
       arr = new ArrayList<>();
       arr.add(1);
    }
    
    public void add(int num) {
        if (num == 0){
            arr.clear();
            arr.add(1);
            return;
        }
        int n = arr.size();
        arr.add(arr.get(n-1) * num);
    }
    
    public int getProduct(int k) {
        // give product of last k elements;
        int n = arr.size();
        if (k >= n ){
            return 0;
        }
        return (arr.get(n-1)/arr.get(n-1-k));
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */