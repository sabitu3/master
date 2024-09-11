package practice.Algorithms;

public class PatternPrinting {

    public static void main(String[] args) {
        // print(5);
        //print2(5);
        // print3(5);
        //  print6(5);
        // print7(5);
        //numberCrown(3);

        //rightAngleTirangle(4);
        // pattern14(4);
        // pattern16(4);
        //pyramidPattern(5);
        // pattern17(3);
        //pattern18(5);
        //pattern19(4);
        pattern20(5);
       // pattern21(4);


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
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
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
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < (2 * n - (2 * i + 1)); j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }

    }

    static void numberCrown(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            //number
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }

    static void rightAngleTirangle(int n) {

        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num += 1;
            }
            System.out.println();

        }


    }

    static void pattern14(int n) {

        for (int i = 1; i <= n; i++) {
            int num = 65;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) num + " ");
                num += 1;
            }
            System.out.println();
        }
    }


    static void pattern16(int n) {
        for (int i = 0; i <= n; i++) {
            ;
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }

    static void pyramidPattern(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                // System.out.println("value of j ==>"+(j = n - i - 1));
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    static void pattern17(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(ch);
                if (j < breakpoint) ch++;
                else ch--;
            }

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();

        }

    }

    static void pattern18(int n) {

        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }


    }

    static void pattern19(int n) {
        int initial = 0;

        for (int i = 0; i < n; i++) {
            //stars
            for (int j = 1; j <= n - i; j++) {

                System.out.print("*");
            }
            //spaces
            for (int j = 0; j < initial; j++) {
                System.out.print(" ");

            }
            //stars
            for (int j = 1; j <= n - i; j++) {

                System.out.print("*");
            }
            initial += 2;
            System.out.println();

        }

        int initialS = 2 *n - 2;
        for (int i = 1; i <= n; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 0; j < initialS; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            initialS -= 2;
            System.out.println();
        }

    }

    /*
     pattern20

     *        *
     **      **
     ***    ***
     ****  ****
     **********
     ****  ****
     ***    ***
     **      **
     *        *

    * */

    static void pattern20(int n) {
        int space = 2*n - 2;
        for (int i = 1; i <= 2 * n - 1; i++) {
            //stars
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }

            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            System.out.println();
            if (i < n) {
                space -= 2;
            } else
                space += 2;

        }
    }


    /*
    *

     ****
     *  *
     *  *
     ****

    *
    * */

    static void pattern21(int n){
        for(int i=0; i<n; i++){
            //stars
            for(int j=0; j<n; j++){
                if((i==0) || (j==0 )|| (i== n-1) || (j==n-1)){
                    System.out.print("*");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();

        }
    }


}

