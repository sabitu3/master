package LearnYard_DSA.PracticingLoops.BinarySearch;

import java.util.Arrays;

/*
* https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1
*
* */

public class FloorAndCiel {

    public static void main(String[] args) {
       int x = 7 ;
        int arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        getFloorAndCeil(x,arr);

    }

   static int[] getFloorAndCeil(int x, int[] arr1) {

        int a=findFloor(arr1,x);
        int b=findCiel(arr1,x);
        System.out.println("Floor and Ciel of x are: "+a+ " and "+ b);
        return new int[]{a,b};
    }

    //upper bound with variation of > to <=
    static int findFloor(int [] arr, int x){
        Arrays.sort(arr);
        int n= arr.length;
        int start= 0;
        int end= n-1;
        int answer=-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]<=x){
                answer = arr[mid];
                start=mid+1;
            }
            else{
                end= mid-1;
            }

        }

        return answer;
    }

    //lower bound
    static int findCiel(int [] arr, int x){
        Arrays.sort(arr);
        int n= arr.length;
        int start= 0;
        int end= n-1;
        int answer=-1;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]>=x){
                answer = arr[mid];
                end=mid-1;
            }
            else{
                start= mid+1;
            }

        }

        return answer;
    }
}
