\*
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.
*\
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int good = 0;
        for(int l = 0; l < nums.length-1; l++){
            for(int r = l+1; r < nums.length; r++){
                if(nums[l] == nums[r]){
                    good++;
                }
            }
        }
        return good;
    }
}