\*
A factor of an integer n is defined as an integer i where n % i == 0.
Consider a list of all factors of n sorted in ascending order, return the kth factor in this list or return -1 if n has less than k factors
*\

class Solution {
    public int kthFactor(int n, int k) {
        int[] factors = new int[k];
        factors[0] = 1;
        int i = 1;
        int f = 2;
        while(i < k){
            if (n % f == 0){
                factors[i] = f;
                i++;
            }
            if (f > n){
                return -1;
            }
            f++;
        }
        return factors[k-1];
    }
}


