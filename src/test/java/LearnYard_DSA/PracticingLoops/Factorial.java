package LearnYard_DSA.PracticingLoops;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=1;
        for(int i=1; i<=n; i++){
            sum= sum*i;
           // n--;

        }
        System.out.println("factorial is "+sum);
    }



}
