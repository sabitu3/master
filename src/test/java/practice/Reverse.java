package practice;

import jdk.nashorn.internal.objects.NativeString;

import java.util.*;

public class Reverse {


    public static void main(String[] args) {

        //printDuplicates("Sabitu Gautam");
        //movZeroes2();
        //reverseSentence("I.love.my.india");
        //reverseOnlyalphaChars("S@bi$uG@ut@m");
        //System.out.println(specialPalindrome(8,3));
        //int n[] ={1, 10, 1, 2, 2, 3, 10, 3, 3, 4, 5, 5};
        //removeDuplicateNumbers(n);
        // printDuplicates("nitin");
        //revNumber(543);
        //checkArmstrong(121);

//
//        String s[] = "i.like.this.program.very.much".split("'\'.'");
//        String ans = "";
//        for (int i = s.length - 1; i >= 0; i--)
//        {
//            System.out.println("array values "+s[i]);
//            ans += s[i] + " ";
//        }
//        System.out.println("Reversed String:");
//        System.out.println("Answer length is "+ans.length());
//        System.out.println(ans.substring(0,
//                ans.length() - 1));

        // Java program to reverse a string
// s = input()
//
//                String s[] = "i.like.this.program.very.much".
//                        split("\\.");
//                String ans = "";
//                for (int i = s.length - 1; i >= 0; i--)
//                {
//                    System.out.println("Array values are "+s[i]);
//                    ans += s[i] + " ";
//                }
//                System.out.println("Reversed String:");
//                System.out.println(ans.substring(0,
//                        ans.length() - 1));
//                System.out.println("Answer is "+ans);

        // printDuplicateUsingMap("missisipi");


    }

    public static void reverseString(String str) {

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println(" reversed string is " + rev);

    }

    public static void reverseSentence(String sentence) {

        String[] res = sentence.split("\\.");
        String str = "";

        for (int i = res.length - 1; i >= 0; i--) {
            System.out.println("array is " + res[i]);

            str = str + " " + res[i];
        }
        System.out.println("Reversed sentence is " + str);

    }

    public static void reverseOnlyalphaChars(String str) {

        String rev = "";
        char[] ch = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isAlphabetic(ch[i])) {
                rev = rev + str.charAt(i);

            }

        }
        System.out.println("Reversed string is " + rev);
    }

    public static String specialPalindrome(int n, int k) {


        String res = "";

        for (int i = 0; i < k; i++)
            res = res + (char) ('a' + i);

        int count = 0;

        for (int i = 0; i < n - k; i++) {
            res = res + (char) ('a' + count);
            count++;

            if (count == k)
                count = 0;
        }

        return res;


    }

    public static void removeDuplicateNumbers(int[] nos) {

        ArrayList<Integer> al = new ArrayList<>();

        for (int i = 0; i < nos.length; i++) {
            if (!al.contains(nos[i])) {
                al.add(nos[i]);
            }

        }
        System.out.println(al);

    }

    public static void removeDuplicatechar(String str) {

        char[] ch = str.toCharArray();

        Set<Character> setCh = new LinkedHashSet<>();

        for (Character c : ch) {
            if (!setCh.contains(c)) {
                setCh.add(c);
            }

        }
        System.out.println("String without duplicate characters are " + Arrays.toString(setCh.toArray()));


    }

    public static void printDuplicates(String str) {

        //str.toCharArray()

        char[] st = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    st[i] = str.charAt(i);
                }
            }
        }

        System.out.println(st);
    }

    public static void printDuplicateUsingMap(String str) {

        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            if (charMap.containsKey(c)) {
                // System.out.println("map value get "+charMap.get(c)+1);
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }

        }
        System.out.println("Duplicate char occurences is " + charMap);
        Map<Character, Integer> tm = new TreeMap<>();

        tm.putAll(charMap);
        System.out.println("Sorted version is " + tm);

    }

    public static void ithElementInArray(int[] arr) {

        //pehle sort karo then ith highest kese bi nikal sakte hai bas array length
        // me se wo minus kardena hai ith position pe jo highest hoga wo aa jaega
        //int[] arr = {65,96,356,9999,656,1,65,4,6};

        //int i;
        //int largest = arr[0];
        int max;

        //sort the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    max = arr[i];
                    arr[i] = arr[j];
                    arr[j] = max;

                }
            }
        }

        System.out.println("Max element is " + arr[arr.length - 1]);
        System.out.println("2nd largest element is " + arr[arr.length - 2]);
        System.out.println("3rd largest element is " + arr[arr.length - 3]);

    }

    public static void revOnlyWords(String str) {

        String rev = "";

        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            String revWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {

                revWord = revWord + word.charAt(j);

            }
            rev = rev + revWord + " ";

        }

        System.out.println("Reversed sentence is " + rev);


    }

    public static void move0ToEndOfArray() {
        int[] inputArr = {0, 10, 43, 27, 0};
        System.out.println("array length is "+inputArr.length);
        int counter = 0;
        for (int i = 0; i < inputArr.length; i++) {
            if (inputArr[i] != 0) {
                inputArr[counter] = inputArr[i];
                counter++;
                System.out.print(counter + ",==> ");
            }
        }
        System.out.println("counter is ===> "+counter);
        while (counter < inputArr.length) {
            inputArr[counter] = 0;
            counter++;
            System.out.println(counter + ", abc ");

        }
        System.out.println("\n");
        System.out.println(Arrays.toString(inputArr));
    }

    public static void movZeroes(){

        int [] arr = {10,5,25,0,11,0,45};
        int count =0;

        for (int e: arr) {
            count++;


        }

        System.out.println("length is "+count);
    }

    public static void movZeroes2(){

        int [] arr = {10,5,25,0,11,0,45};
        int count =0;

        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[count]=arr[i];
                count++;
            }
        }

        while (count<arr.length){
            arr[count]=0;
            count++;

        }

        System.out.println("Final array is "+Arrays.toString(arr));
    }


    //wap to reverse the given number

    public static void revNumber(int no){
        //121
        int rev=0;
        int rem;
         while (no!=0){
             rem = no%10;
             rev = rev*10+rem;
             no=no/10;
         }
            System.out.println(" reversed no is "+rev);

    }

    public static void checkArmstrong(int no){
        int rem;
        int sum=0;
        int temp = no;
        while (temp!=0){
            rem = temp%10;
            sum= sum+(rem*rem*rem);
            temp = temp/10;
        }
        if(no==sum){
            System.out.println(no+" Number is a armstrong number");
        }
        else {
            System.out.println(no+" Number is not a armstrong number");
        }

    }

}


