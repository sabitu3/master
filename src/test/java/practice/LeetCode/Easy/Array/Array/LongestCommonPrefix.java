package practice.LeetCode.Easy.Array.Array;

import java.util.Arrays;

/*
 * Ref: https://www.youtube.com/watch?v=wtOQaovlvhY&t=748s
 *Sort the array first then, it will be sorted in lexographical order. then compare first
 * last string of the array
 *
 * */

public class LongestCommonPrefix {

    public static void main(String[] args) {
        getString(new String[]{"flower", "flow", "fluest", "flowing"});
    }

    public static String getString(String[] str) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(str);
        char[] first = str[0].toCharArray();
        char[] last = str[str.length - 1].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] != last[i])
                break;
            sb.append(first[i]);

        }

        System.out.println(" longest prefix is " + sb);
        return sb.toString();

    }
}
