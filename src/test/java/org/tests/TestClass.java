package org.tests;


import java.util.Arrays;

public class TestClass {



    public static void main(String[] args) {


        int [] arr = {0,1,0,0,1};
        int max=0;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    max= arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;
                }

            }
        }

        System.out.println(Arrays.toString(arr));



    }

}
