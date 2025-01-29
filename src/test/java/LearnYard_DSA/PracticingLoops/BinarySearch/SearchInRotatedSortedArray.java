package LearnYard_DSA.PracticingLoops.BinarySearch;

/*
 * https://leetcode.com/problems/search-in-rotated-sorted-array/description/
 * */
public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        // Output: 4
        search(nums, target);

    }

    public static int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {

            int mid = (start + end) / 2;
            if (nums[mid] == target) {

                System.out.println("target element found is : " + mid);
                //element found return index
                return mid;
            } else if (nums[start] <= nums[mid]) {  // IF LEFT PART IS SORTED
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;  //move to left part
                } else {
                    start = mid + 1;
                }
            } else {

                if (target >= nums[mid] && target <= nums[end]) { //RIGHT PART IS SORTED

                    start = mid + 1;//move to right part
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }


}
