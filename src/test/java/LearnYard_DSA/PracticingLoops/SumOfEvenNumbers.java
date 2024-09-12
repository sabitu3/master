package LearnYard_DSA.PracticingLoops;

import java.util.Scanner;

public class SumOfEvenNumbers {

    /*4. Program to find sum of all even numbers between 1 to n.*/
    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum + " ");


    }

}
