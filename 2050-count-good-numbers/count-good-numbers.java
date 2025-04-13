class Solution {

    public int findPower(int a, long b) {
        int mod = 1000000007;
        if (b == 0)
            return 1;

        long half = findPower(a, b / 2);
        long result = (half * half) % mod;

        if (b % 2 == 1)
            return (int)((result * a) % mod);

        return (int)result;
    }

    public int countGoodNumbers(long n) {
        int mod = 1000000007;
        long odd = n / 2;
        long even = (n + 1) / 2;

        long part1 = findPower(5, even);
        long part2 = findPower(4, odd);
        return (int)((part1 * part2) % mod);
    }
}
