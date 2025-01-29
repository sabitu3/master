package practice.LeetCode.Easy.Array.Array;

import java.util.Arrays;

public class MergeTwoSortedArray {

    //BruteForce

    public static void main(String[] args) {
        int arr1[] = {1, 3, 5, 7, 15, 56, 19};
        int n1 = arr1.length;
        int arr2[] = {2, 4, 9, 6, 0, 21};
        int n2 = arr2.length;
        int arr3[] = new int[n1 + n2];
        //mergeSortedArrayBruteForce(n1,arr1, n2,arr2,arr3);
        mergeSortedArrayOptimal(arr1, arr2, n1, n2);
        System.out.println("sorted array is " + Arrays.toString(arr1) + Arrays.toString(arr2));
    }

    public static void mergeSortedArrayBruteForce(int n1, int[] arr1, int n2, int[] arr2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1) {
            arr3[k] = arr1[i];
            k++;
            i++;
        }

        while (j < n2) {
            arr3[k] = arr2[j];
            k++;
            j++;
        }

        //Arrays.sort(arr3);
    }

    public static void mergeSortedArrayOptimal(int[] arr1, int[] arr2, int n, int m) {
        int i = n - 1;
        int j = 0;
        long temp = 0;

        while (i >= 0 && j < m) {
            if (arr1[i] >= arr2[j]) {
                temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = (int) temp;
            }
            i--;
            j++;
        }



        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }


}
