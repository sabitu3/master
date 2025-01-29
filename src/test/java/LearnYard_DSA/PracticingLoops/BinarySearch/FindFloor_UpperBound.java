package LearnYard_DSA.PracticingLoops.BinarySearch;


/*
LOWER BOUND
* https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
UPPER BOUND with little variation from changing > to <=
*/

public class FindFloor_UpperBound {

    public static void main(String[] args) {
        int arr [] = {1, 2, 8, 10, 11, 12, 19};
        int k = 5;
        findFloor(arr,k);

    }

    public static int findFloor(int []arr , int k){
        int n = arr.length;
        int start=0;
        int end = n-1;
        int answer= -1;

        while(start<= end){
            int mid = (start+end)/2;
            if(arr[mid]<=k){
                answer=mid;
                start=mid+1;
            }
            else{
                end= mid-1;
            }

        }
        System.out.println("answer is "+answer);
        return answer;
    }


}
