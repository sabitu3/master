package LearnYard_DSA.PracticingLoops.BinarySearch;

/*
* https://leetcode.com/problems/search-a-2d-matrix-ii/description/
* */
public class Search2DMatrix {

    public static void main(String[] args) {
        int matrix [][]= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;

        //answer should be true;

        search2DMatrix(matrix,target);
    }

    public static Boolean search2DMatrix(int [][] matrix, int target){
        int m= matrix.length;
        int n= matrix[0].length;

        //Approach is taking 2 pointers i and j

        int i=0;
        int j = n-1;

        while(i<m && j>=0){
            if(matrix[i][j]==target){
                System.out.println("target element "+target +" found");
                return  true;
            }

            else if (matrix[i][j]>target){
                j--;
            }
            else{
                i++;
            }

        }

        return false;

    }


}
