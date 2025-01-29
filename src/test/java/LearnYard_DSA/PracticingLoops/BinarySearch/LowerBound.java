package LearnYard_DSA.PracticingLoops.BinarySearch;

/*
* https://takeuforward.org/arrays/implement-lower-bound-bs-2/
* */

public class LowerBound {

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int k = 9;
        int ind = lowerBound(arr, k);
        System.out.println("The lower bound is the index: " + ind);
    }


    public static int lowerBound(int arr [], int k){
        int n = arr.length;
        int start=0;
        int end = n-1;
        int answer=n;

        while(start<=end){
            int mid = (start+end)/2;
            if(arr[mid]>=k){
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
