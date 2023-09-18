package com.wind.algorithm.array;

public class Solution {

    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int left = 0, right = 0;
        while (right < nums.length) {
            if (nums[right] != nums[left]) {
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nu = new int[]{1,2};
        System.out.println(removeDuplicates(nu));
    }

}
