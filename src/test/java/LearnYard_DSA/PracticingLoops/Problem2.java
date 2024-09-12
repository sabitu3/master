package LearnYard_DSA.PracticingLoops;

import java.util.Scanner;

public class Problem2 {

   /* Program to check whether a number is divisible by 5 and 11 or
    not.*/

    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        if (number % 5 == 0 && number % 11 == 0){
            System.out.println("Number is divisible by 5 and 11");
        }
        else{
            System.out.println("number is not divisible by 5 and 11");
        }

    }
}
