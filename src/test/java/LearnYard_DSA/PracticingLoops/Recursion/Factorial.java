package LearnYard_DSA.PracticingLoops.Recursion;

public class Factorial {

    public static void main(String[] args) {

        //factorial(5);
        System.out.println("Factorial is: "+factorial(5));
    }

    public static int factorial(int n){

        if(n<=1){
            return 1;
        }
        int fact = n*factorial(n-1);
        return fact;
    }
}
