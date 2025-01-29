package LearnYard_DSA.PracticingLoops.BinarySearch;

import java.util.Arrays;

//first and last position of element
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class FirstAndLastOccurence {

    public static void main(String[] args) {

        int arr [] ={5,7,7,8,8,10};
        int target = 8;
        int answer [] = new int[2];
        answer[0]= firstOccurence(arr,target);
        answer[1]= lastOccurence(arr,target);

        System.out.println("answer is "+ Arrays.toString(answer));


    }

    public static int firstOccurence(int arr[], int target){
        int n = arr.length;
        int start =0;
        int end =n-1;
        int answer =n;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                answer= Math.min(answer,mid);
                end= mid-1;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }

            else{
                start= mid+1;
            }
        }
        if(answer==n){
            answer=-1;
        }
        return answer;

    }

    public static int lastOccurence(int arr[], int target){
        int n = arr.length;
        int start =0;
        int end =n-1;
        int answer =-1;

        while(start<=end){
            int mid= (start+end)/2;
            if(arr[mid]==target){
                answer= Math.max(answer, mid);
                start=mid+1;
            }

            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return answer;
    }

}
