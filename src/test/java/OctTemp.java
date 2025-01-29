import java.util.Arrays;

public class OctTemp {
    public static void main(String[] args) {

        //input: RED yellow GREEN blue BLACK
        //output Red Yellow Green Blue BlAcK

        String str = "RED yellow GREEN blue BLACK";

       String arr[]= str.split(" ");

        //System.out.println("string==="+ Arrays.toString(arr));

       for(int i=0; i<arr.length; i++){
           char ch [] =arr[i].toCharArray();
           if(Character.isLowerCase(ch[i + 1])){

           }

       }


    }
}
