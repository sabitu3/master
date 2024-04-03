package practice;

public class Palindrome {

    public static void main(String[] args) {
        checkPalindrome(121);
    }

    public static boolean checkPalindrome(int no) {

        if(no<0){
            return false;
        }
        long rev = 0;
        long temp=no;
        while (temp != 0) {

           int rem = (int)temp % 10;
            rev =rev*10+rem;
            temp = temp / 10;

        }
        System.out.println("reverse no is "+rev);
        if(rev==no){
            System.out.println("no is palindrome");
            return true;
        }
        else {
            System.out.println("not a palindrome");
            return false;
        }

    }
}
