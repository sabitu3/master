package practice.LeetCode.Easy.Array.Array;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int [] arr ={12,3,10,2,5,21};
        sortArray(arr);
    }

    public static void sortArray(int [] arr){

        int max =0;
        for(int i=0; i<arr.length; i++){
            for(int j =i+1; j<arr.length;j++){
                if(arr[i]>arr[j]){
                    max= arr[i];
                    arr[i]= arr[j];
                    arr[j]= max;


                }
            }
        }

        System.out.println("sorted array is "+ Arrays.toString(arr));

    }

}
