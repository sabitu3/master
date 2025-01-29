import java.util.Arrays;
import java.util.Scanner;

public class Kotak {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        int size = myObj.nextInt();
        int arr[] = new int[size];

        for(int i=0; i<arr.length; i++){
            arr[i] =myObj.nextInt();
        }
        solution(arr);


    }

    public static int[] solution(int [] arr) {

        int small=arr[0];
        int secondSmall=0;

        int answer[] = new int[2];

        for(int i=0; i<arr.length; i++){
            if(arr[i]<=small){
                small=arr[i];
            }
        }

        for(int j=0; j<arr.length; j++){
            if(arr[j]<=small){
                secondSmall=arr[j];
            }

        }
        answer[0]= small;
        answer[1]=secondSmall;

        System.out.println("answer array is "+ Arrays.toString(answer));

        return answer;

    }
}
