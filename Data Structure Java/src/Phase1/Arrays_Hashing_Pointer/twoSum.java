package Phase1.Arrays_Hashing_Pointer;

import java.util.Arrays;

public class twoSum {
    public static int[] findTwoSum(int[] nums, int target) {
        // 1. Sort the array
        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int currentSum = nums[left] + nums[right];

            if (currentSum == target) {
                return new int[]{nums[left], nums[right]};
            } else if (currentSum < target) {
                left++; // Increase the sum
            } else {
                right--; // Decrease the sum
            }
        }

        return new int[]{-1, -1}; // No pair found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] result = findTwoSum(numbers, target);
        System.out.println("Pair: " + result[0] + ", " + result[1]);
    }
}
