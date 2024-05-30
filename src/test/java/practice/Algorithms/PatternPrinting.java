package practice.Algorithms;

public class PatternPrinting {

    public static void main(String[] args) {
        // print(5);
        //print2(5);
        // print3(5);
        print6(5);
        print7(5);


    }

    /**
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     */
    static void print(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


    /*

     *
     * *
     * * *
     * * * *
     * * * * *
     * * * * * *

     * */

    static void print2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


    /**
     * 1
     * 2 2
     * 3 3 3
     * 4 4 4 4
     * 5 5 5 5 5
     */
    static void print3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    /*
     * * * * * *
     * * * * *
     * * * *
     * * *
     * *
     *
     */

    static void print4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    /**
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     **/
    static void print5(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    /*
             *
            ***
           *****
          *******
         *********

    */
    static void print6(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for (int j = 0; j<n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    /*
           *********
            *******
             *****
              ***
               *

     */


    static void print7(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            //star
            for(int j=0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            //space
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

}

