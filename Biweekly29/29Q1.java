\*
Given an array of unique integers salary where salary[i] is the salary of the employee i.
Return the average salary of employees excluding the minimum and maximum salary.
*\

class Solution {
    public double average(int[] salary) {
        double avg;
        int max = salary[0];
        int min = salary[0];
        int total = salary[0];
        for(int i = 1; i < salary.length; i++){
            if(salary[i] > max){
                max = salary[i];
            } else if (salary[i] < min){
                min = salary[i];
            }
            total += salary[i];
        }
        avg = (double)(total - max - min) / (salary.length - 2);
        return avg;
    }
}