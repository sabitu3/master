package LearnYard_DSA.PracticingLoops.BinarySearch;

/*
* https://takeuforward.org/arrays/implement-upper-bound/
* */
public class UpperBound {

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 9,15, 19};
        int k = 9;
        int ind = upperBound(arr, k);
        System.out.println("The upper bound is the index: " + ind);
    }


    public static int upperBound(int arr [], int k){
        int n = arr.length;
        int start=0;
        int end = n-1;
        int answer=n;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>k){
                answer=mid;
                end= mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return answer;

    }
}
