package practice.LeetCode.Easy.Array.Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args) {
        //twoSum(new int[]{2, 12, 5,7,7, 15, 1, 8, 76, 3,6, 6,}, 9);

        //newSum(new int[]{2,30,11,5,13}, 35);

        sumOfArray(new int[]{13, 2, 5, 8, 13, 4});

    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        //2,7,11,15
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int rem = target - num;
            if (map.containsKey(rem)) {
                int index = map.get(rem);
                if (index == i) continue;
                int[] result1 = new int[]{i, index};
                System.out.println("result is<<<<>>>><>>><>>><<<"+Arrays.toString(result1));
                return new int[]{i, index};
            }
        }
        return new int[]{};

    }


   /* public static int [] newSum(int[] nums, int target){

        int result [] = new int[2];

        Map<Integer,Integer> map = new HashMap<>();
        for()

    }*/

    public static int [] newSum(int[] nums, int target){

        int result [] = new int[2];

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    int[] result1 = new int[]{i, j};

                    System.out.println("result is<<<<>>>><>>><>>><<<"+Arrays.toString(result1));

                    return new int []{i,j};
                }
            }
        }


     return new int []{};

    }

    public static int sumOfArray(int[] nums){
        int temp =0;

        for (int i =0;i<nums.length; i++){
            if(nums[i]==13){
                i++;
                continue;
            }

                temp= temp+nums[i];
        }

        System.out.println("sum is "+temp);
        return temp;

    }

}
