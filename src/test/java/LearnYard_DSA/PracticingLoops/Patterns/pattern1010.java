package LearnYard_DSA.PracticingLoops.Patterns;

import java.util.Scanner;

public class pattern1010 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();

        for(int i=1; i<=row; i++){

            for(int j=1; j<=row; j++){
                if(j%2==0){
                    System.out.print("1");
                }

                else{
                    System.out.print("0");
                }

            }
            System.out.println();

        }
    }
}
