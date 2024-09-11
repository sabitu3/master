package practice;

import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {
         final int N=4;
        int A[][]={{1,3,5,2},
                   {3,5,1,1},
                   {2,5,4,1},
                   {7,3,4,5}};

        int B[][] = new int[N][N],i, j;
        transposeMatrix(A,B,N);
        System.out.println("transported matrix is \n");

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
                System.out.print(B[i][j] + " ");
            System.out.print("\n");
        }


    }

    public static void transposeMatrix(int A[] [] , int B[][],int N){
        //int i,j;

        for(int i=0; i<N; i++){
            for(int j =0; j<N; j++){
                B[i][j]= A[j][i];
            }

        }

    }
}
