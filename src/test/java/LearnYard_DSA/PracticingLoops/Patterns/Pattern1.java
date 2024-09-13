package LearnYard_DSA.PracticingLoops.Patterns;

import java.util.Scanner;

public class Pattern1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int no=5;
        int row= 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=row; j++){
                System.out.print(no);
            }
            no=no-1;
            row= row+1;
            System.out.println();
        }

    }
}
