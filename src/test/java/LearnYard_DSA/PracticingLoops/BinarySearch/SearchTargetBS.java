package LearnYard_DSA.PracticingLoops.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchTargetBS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arrs[] = new  int[n];

        for(int i =0; i<n ; i++){
            arrs[i]= in.nextInt();
        }

        System.out.println("array is "+Arrays.toString(arrs));
        search(arrs,5);

    }

    //1 3 5 7 9 11
    //0 1 2 3 4 5
    public static int search(int[] arr, int target) {

        int n = arr.length;
        //Finding range
        int start = 0;
        int end = n-1;


        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]==target){
                System.out.println("mid is "+mid);
                return mid;
            }

            //move RIGHT
            else if(arr[mid] <target){
                start= mid+1;
            }

            // //move LEFT
            else{
                end=mid-1;
            }
        }

        return -1;

    }
}
