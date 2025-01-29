package LearnYard_DSA.PracticingLoops;

import java.util.Arrays;
import java.util.Scanner;

public class TempDebug {
    public static void main(String[] args) {

        String str = "Thi@%@#s is ne%#%w ver#%#%5sion releas5646%#$%ed";

        StringBuilder sb = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            if(Character.isLetterOrDigit(str.charAt(i)) || str.charAt(i)==' '){
                sb.append(str.charAt(i));
            }
        }
        System.out.println("output string is "+sb
        );
        /*StringBuilder cleanedStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            // Check if the character is alphanumeric (letter or digit) or a space
            if (Character.isLetterOrDigit(c) || c == ' ') {
                cleanedStr.append(c);
            }
        }

        // Output the cleaned string
        System.out.println("Original String: " + str);
        System.out.println("Cleaned String: " + cleanedStr.toString());*/






        }

    }
