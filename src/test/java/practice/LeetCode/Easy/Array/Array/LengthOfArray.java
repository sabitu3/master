package practice.LeetCode.Easy.Array.Array;

public class LengthOfArray {

    /*Find the length of an array without using length() or any inbuilt function */

    public static void main(String[] args) {
        int arr[] = {2,3,2,1};
        int count = 0;

        System.out.println("The length of the array is: " + count);

        for (int a : arr) {
            count++;
        }
        System.out.println("size of array is " + count);

    }

}
