package practice;

public class ReverseRetainingSpaces {

    public static void reverse(char [] arr){
        int l =0;
        int r = arr.length-1;

        while (l<r){
            if(!Character.isAlphabetic(arr[l])){
                l++;
            }
            else if (!Character.isAlphabetic(arr[r])){
                r--;
            }
            else {
                char temp =arr[r];
                arr[r]= arr[l];
                arr[l]= temp;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {

        String str ="my name is sabitu";
        char[] characters = str.toCharArray();
        reverse(characters);
        String str1 = new String(characters);
        System.out.println("reversed string is "+ str1);



    }
}
