package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Temp {


    public static void main(String[] args) throws IOException {
        solve(123);


    }
    static int solve(int n ){
        int reverse=0;
        int rem =0;

        while (n!=0){
            reverse = n%10;
            reverse= reverse*10+rem;
            n= n/10;
        }
        System.out.println("reversed no is "+reverse);
        return reverse;
    }

}
