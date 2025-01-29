package LearnYard_DSA.PracticingLoops.Arrays;

public class TwoSumInSortedArray {


    public static void main(String[] args) {

    }
    public int[] twoSum(int[] numbers, int target) {

        int result [] = new int[2];
        // result[0]=-1;
        // result[1]=-1;

        int i=0;
        int n =numbers.length;
        int j= n-1;
        while(i<j){
            int currentSum=numbers[i]+numbers[j];
            if(currentSum==target){
                result[0]=i;
                result[1]=j;
                break;
            }

            else if(currentSum>target){
                j--;
            }

            else{
                i++;
            }
        }

        return result;

    }

}
