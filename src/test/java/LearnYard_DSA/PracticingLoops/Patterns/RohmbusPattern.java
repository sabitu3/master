package LearnYard_DSA.PracticingLoops.Patterns;
import java.util.Scanner;

public class RohmbusPattern {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();

        int space =0;
        for(int i=1; i<=row; i++){
            for(int j=1; j <= space; j++){
                System.out.print(" ");
            }

            for(int j=1; j <= row; j++){
                System.out.print("*");
            }
            space+=1;
            System.out.println();
        }

    }


}
