\*
Given the array nums consisting of n positive integers.
You computed the sum of all non-empty continous subarrays from the array and then sort them in non-decreasing order, creating a new array of n * (n + 1) / 2 numbers.

Return the sum of the numbers from index left to index right (indexed from 1), inclusive, in the new array.
*\
class Solution {
    int[] ary;
    public int rangeSum(int[] nums, int n, int left, int right) {
        ary = new int[n*(n+1)/2];
        createAry(nums);
        Arrays.sort(ary);
        int total = 0;
        for(int i = left-1; i < right; i++){
            total += ary[i];
        }
        return total;
    }
    public void createAry(int[] nums){
        int np = 0;
        for(int i=0; i < nums.length; i++){
            ary[np] = nums[i];
            np++;
        }
        int sum;
        for(int j = 0; j < nums.length-1; j++){
            for(int q = j+1; q < nums.length; q++){
                sum = 0;
                for (int s = j; s <= q; s++){
                    sum += nums[s];
                }
                ary[np] = sum;
                np++;
            }
        }
    }
}