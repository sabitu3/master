package practice.Algorithms.String;

public class StringProblems {

    public static void main(String[] args) {
        String str = "aabccccdeee";
        solve(str);
    }

    static String solve(String str) {

        String res = "";
        int count = 1;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i) == str.charAt(i + 1) ){
                count++;
                continue;
            } else {
                res = res + count + str.charAt(i);
                count = 1;
            }

        }

        res= res+count+str.charAt(str.length()-1);
        System.out.println("String result is "+res);
        return res;
    }
}