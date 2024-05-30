package practice.Algorithms.Searching.LinearSearch;

/**
 * https://www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/employee-rating-8cd8dc10/
 * You are an IT company's manager. Based on their performance over the last N working days, you must rate your employee.
 * You are given an array of N integers called workload, where workload[i] represents the number of hours an employee worked on an ith day.
 * The employee must be evaluated using the following criteria:
 * Rating = the maximum number of consecutive working days when the employee has worked more than 6 hours.
 * You are given an integer N where N represents the number of working days. You are given an integer array workload where workload[i] represents the number of hours an employee worked on an ith day.
 *
 * Task
 *
 * Determine the employee rating.
 *
 * Example
 * Assumptions
 * N = 12
 * workload = [2, 3, 7, 8, 7, 6, 3, 8, 12, 11, 12, 10]
 * Approach
 * Workload with consecutive hours > 6 = [2, 3, 7, 8, 7, 6, 3, 8, 12, 11, 12, 10] =>  Longest Interval =  [8,12,11,12,10]
 *
 * */

public class EmployeeRating {
    public static void main(String[] args) {
        int N =7;
        int []  workload= new int[]{3, 2, 8, 9, -10, 1,5};
        solve(N, workload);

    }
    static int solve(int N, int [] workload){

        int result =0;
        int counter =0;
        for (int hour : workload) {
            if(hour>6){
                counter++;
                if(counter>result);
                result=counter;
            }
            else {
                counter=0;
            }

        }
        System.out.println("result is "+result);
        return counter;

    }
}
