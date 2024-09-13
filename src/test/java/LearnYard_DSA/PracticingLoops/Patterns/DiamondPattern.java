package LearnYard_DSA.PracticingLoops.Patterns;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int star =1;
        int space = n-1;
        for(int i= 1 ; i<=n; i++){
            //space
            for(int j=1; j<=space;j++){
                System.out.print(" ");
            }
            //star
            for(int j=2; j<=star; j++){
                System.out.print("*");
            }
            for(int j=1; j<=star; j++){
                System.out.print("*");
            }
            star=star+1;
            space=space-1;
            System.out.println();
        }

        int starr=n-1;
        int spacee=1;

        for(int i= 1 ; i<=n-1; i++){
            //space
            for(int j=1; j<=spacee;j++){
                System.out.print(" ");
            }
            //star
            for(int j=2; j<=starr; j++){
                System.out.print("*");
            }

            for(int j=1; j<=starr; j++){
                System.out.print("*");
            }
            starr=starr-1;
            spacee=spacee+1;
            System.out.println();
        }
    }
}
