public class TestMAersk {


    public static void main(String[] args) {
      /*  String str = "Java and selenium";

       String[] strs= str.split(" ");

       String output ="";

       for(int i=0; i<strs.length; i++){
               for(int j=strs[i].length()-1; j>=0 ;j--){
                   output=output +strs[i].charAt(j);
               }
               output=output + " ";
       }

        System.out.println("output string is "+output);*/

        StringBuffer str1 = new StringBuffer("java");
        StringBuffer str2 = str1;
        str1.append("interview");
        System.out.println(str1 + " " + str2 + " " + (str1 == str2));
    }
}
