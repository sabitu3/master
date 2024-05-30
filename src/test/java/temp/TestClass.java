package temp;

import java.sql.Array;
import java.util.ArrayList;

public class TestClass {

    public static void main(String[] args) {

       /* //Input : ccccOddEEEccCoo
//Output : c4O1d2E3c2C1o2


        String input = "ccccOddEEEccCoo";
        int count =0;

        ArrayList<String> output = new ArrayList<>();

        for(int i=0; i<input.length(); i++){

            for(int j=i+1; j<input.length(); j++){

                if(input.charAt(i)==input.charAt(j)){
                    count++;
                    output.add(String.valueOf(input.charAt(i)));
                }

            }
        }

        System.out.println("output is "+output);

*/


        //dict = ["abb", "abc", "xyz", "xyy"];
        //pattern = "foo"
        //Output: [xyy abb]

        //https://www.w3resource.com/java-exercises/basic/java-basic-exercise-199.php

      /*  String [] dict = {"abb", "abc", "xyz", "xyy"};

        String pattern= "foo";

        for(int i=0; i<dict.length; i++){

           char ch [] =dict[i].toCharArray();



        }*/



        /*String str="This is a pen";
        // nep a si sihT
        String res="nepa si s ihT";



        String output ="";
       String[] arr= str.split(" ");
        System.out.println("al is "+ Arrays.toString(arr));

        System.out.println("size is "+arr.length);

        for( int i = arr.length; i>0; i--){

            output = output+arr[i];
        }

        System.out.println(" output string is "+output);

    }

*/

        String str="aabbbcdfghhhhhhdaa";
       // String res="a2b3cdfgh6da2";

        int count =1;
        String result="";

        for( int i=0; i<str.length(); i++){
            for (int j =i+1; j<str.length(); j++){

                while(str.charAt(i)==str.charAt(j)){
                    count++;
                    result= result+str.charAt(i)+count;
                };

                count =1;

            }

        }

        System.out.println("output is "+result);







    }
}
