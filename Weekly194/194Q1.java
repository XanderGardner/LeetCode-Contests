/* Given an integer n and an integer start.
Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
Return the bitwise XOR of all elements of nums. */

class Solution {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = start + 2*i;
        }
        if(n == 1){
            return nums[0];
        }
        int xor = nums[0] ^ nums[1];
        for(int j = 2; j < n; j++){
            xor = xor ^ nums[j];
        }
        return xor;
    }
}