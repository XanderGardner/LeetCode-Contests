\*
Given a binary string s (a string consisting only of '0' and '1's).

Return the number of substrings with all characters 1's.

Since the answer may be too large, return it modulo 10^9 + 7
*\
class Solution {
    public int numSub(String s) {
        long n = 0;
        long add;
        String[] groups = s.split("0");
        for(int i = 0; i < groups.length; i++){
            if (groups[i].length() != 0 && groups[i] != null){
                add = addFactorial(groups[i].length());
                if (add > 0){
                     n += add;
                }
               
            }
        }
        return (int)(n % (int)(Math.pow(10,9)+7));
        
    }
    long addFactorial(long num){
        long total = 0;
        while(num > 0){
            total += num;
            num--;
        }
        return total;
    }
}