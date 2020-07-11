\*
Given an array nums, you are allowed to choose one element of nums and change it by any value in one move.

Return the minimum difference between the largest and smallest value of nums after perfoming at most 3 moves.
*\
class Solution {
    int[] ar;
    public int minDifference(int[] nums) {
        if (nums.length < 4){
            return 0;
        }
        Arrays.sort(nums);
        int[] ar = nums;
        int min;
        int check;
        check = ar[ar.length-4] - ar[0];
        min = check;
        check = ar[ar.length-3] - ar[1];
        if (check<min){
            min = check;
        }
        check = ar[ar.length-2] - ar[2];
        if (check<min){
            min = check;
        }
        check = ar[ar.length-1] - ar[3];
        if (check<min){
            min = check;
        }
        return min;
    }
}