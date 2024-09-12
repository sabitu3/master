package LearnYard_DSA.PracticingLoops;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if(n%2==0){
            System.out.println(n+" is even number");
        }
        else if((n+1)%2==0){
            System.out.println(n+" is odd number");
        }

        else{
            System.out.println("number is invalidddd");
        }


    }
}
