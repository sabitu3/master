import java.util.HashMap;
import java.util.TreeMap;

public class GL {

    public static void main(String[] args) {

        /*
        * Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s in nlogn time complexity.
Example:
Input matrix :           0 1 1 1
                         0 0 1 1
                         1 1 1 1  // this row has maximum 1s
                         0 0 0 0
 */
        int arr [] [] = new int[][];

        int counter=0;
        TreeMap<Integer,Integer> count  = new TreeMap<>();

        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i][j]>0){
                    counter++;
                    count.put(i,counter);
                }
                else {
                    counter=0;
                }
            }

        }




    }

}
