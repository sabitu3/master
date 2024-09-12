package LearnYard_DSA.PracticingLoops;

import java.util.Scanner;

public class HCF {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int minimum =0;
        if(n1<n2){
         minimum=n1;
        }

        else{
            minimum=n2;
        }

        int hcf = 0;

        for (int i = 1; i <= minimum; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("HCF of " + n1 + " & " + n2 + " is " + hcf);

    }
}
