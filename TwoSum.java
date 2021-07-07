/*1. Two Sum
Given an array of integers nums and an integer target, 
return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, 
and you may not use the same element twice.

You can return the answer in any order.
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*/

import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                sum = nums[i] + nums[j];
                if (sum == target) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("Invalid Target");
    }

    public static void main(String[] args) {
        TwoSum test = new TwoSum();
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] obj = test.twoSum(nums, target);
        String outputString = Arrays.toString(obj);
        System.out.println("Output: " + outputString);
    }
}
