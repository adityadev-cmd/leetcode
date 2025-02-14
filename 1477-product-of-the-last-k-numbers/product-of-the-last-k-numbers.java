class ProductOfNumbers {
    private List<Integer> arr ;
    public ProductOfNumbers() {
        // array
        ///dynamic array
       arr = new ArrayList<>();
    }
    
    public void add(int num) {
        arr.add(num);
    }
    
    public int getProduct(int k) {
        // give product of last k elements;
        int lastpos = arr.size() - 1;
        int product = 1;
        while(k-- > 0){
            product *= arr.get(lastpos);
            lastpos --;
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */