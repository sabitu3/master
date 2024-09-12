package LearnYard_DSA.PracticingLoops;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here

        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        if(number<0){
            System.out.println(number+" is negative");
        }

        else if(number>0){
            System.out.println(number+" is positive");
        }

        if(number==0){
            System.out.println(number+" is zero");
        }


    }
}
