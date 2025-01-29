package LearnYard_DSA.PracticingLoops.Recursion;

public class Fibonacci {

    public static void main(String[] args) {

        //0, 1, 1, 2, 3,

        int n = 5;
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

    }

    public static int fibonacci(int n){

        if(n==0 || n==1){
            return n;
        }

        int answer = fibonacci(n-1)+ fibonacci(n-2);
        return answer;
    }
}
