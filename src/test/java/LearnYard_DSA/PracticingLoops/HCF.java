package LearnYard_DSA.PracticingLoops;

import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {
        // Note: Don't change class name
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int hcf = 0;

        for (int i = 1; i < n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + n1 + " & " + n2 + " is " + hcf);

    }
}
