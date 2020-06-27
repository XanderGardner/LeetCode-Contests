\*
Given a binary array nums, you should delete one element from it.
Return the size of the longest non-empty subarray containing only 1's in the resulting array.
Return 0 if there is no such subarray.
*\

class Solution {
    public int longestSubarray(int[] nums) {
        int[] ums = nums;
        int longest = getLongSub(ums);
        int check;
        for (int j = 0; j < ums.length; j++){
            if(ums[j] == 0){
                ums[j] = 1;
                check = getLongSub(ums);
                ums[j] = 0;
                if(check > longest){
                    longest = check;
                }
            }
        }
        return longest - 1;
    }
    
    public int getLongSub(int[] nus){
        int totalOnes = 0;
        int max = 0;
        int previous = nus[0];
        if (nus[0] == 1){
            totalOnes++;
            max = 1;
        }
        for (int i = 1; i < nus.length; i++){
            if (nus[i] == 1){
                totalOnes++;
                if (max < totalOnes){
                    max = totalOnes;
                }
            } else if (previous == 1){
                if (max < totalOnes){
                    max = totalOnes;
                }
                totalOnes = 0;           
            }
            previous = nus[i];
        }
        return max;
    }
}