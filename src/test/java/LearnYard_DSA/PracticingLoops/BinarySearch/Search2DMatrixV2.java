package LearnYard_DSA.PracticingLoops.BinarySearch;

public class Search2DMatrixV2 {

    /*
    *https://leetcode.com/problems/search-a-2d-matrix/description/
    *
    * https://leetcode.com/problems/search-a-2d-matrix/solutions/3874071/100-binary-search-video-simple-solution/*/

    public static void main(String[] args) {

        int matrix [][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 56;
        search2dMatrix(matrix,target);

    }

    public static Boolean search2dMatrix(int matrix [][], int target){
        int m = matrix.length;
        int n = matrix[0].length-1;

        int start =0;
        int end= m*n-1;

        while(start<=end){
            int mid = (start+end)/2;
            int mid_val= matrix[mid/n][mid%n];
            if(mid_val==target){
                System.out.println("target element "+target +" found in 2D matrix");
                return true;
            }
            else if (mid_val>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }

        return false;

    }
}
