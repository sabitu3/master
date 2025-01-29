import java.util.Arrays;
import java.util.Scanner;

public class Netomi {

    public static void main(String[] args) {

        //Input: arr = [1, 2, 3, 7, 5], Sum = 12
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int arr [] = new int[size];
        int sum = in.nextInt();

        for(int i=0 ; i<size; i++){
            arr[i]= in.nextInt();
        }

        int i =0 ;
        int j = size-1;
        int currentSum=0;

        int result [] =  new int[2];

        while(i<j){
            currentSum= arr[i]+arr[j];
            if(currentSum==sum){
                result[0]= arr[i];
                result[1]=arr[j];
            }
            if(currentSum<sum){
                i++;
            }

            else {
                j--;
            }
        }

        System.out.println("result array is "+ Arrays.toString(result));



    }
}
