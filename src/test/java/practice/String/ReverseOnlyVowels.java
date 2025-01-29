package practice.String;

import java.util.Scanner;

public class ReverseOnlyVowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseVowel(str);


    }

    public static void reverseVowel(String str){
       char ch [] = str.toCharArray();
       int start=0;
       int end = str.length()-1;

       while(start<end){
           if(!isVowel(ch[start])){
               start++;
           }
           else if(!isVowel(ch[end])){
               end--;
           }

           else {
               char temp =ch[start];
               ch[start]=ch[end];
               ch[end]= temp;
               start++;
               end--;
           }

       }

        System.out.println("output string is "+String.valueOf(ch));
    }

    public static  boolean isVowel(char ch){
        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch =='u' || ch == 'A' || ch=='E' || ch=='I' || ch=='O' || ch =='U' ){
            return true;
        }
        else {
            return false;
        }
    }
}
