package com.wind.algorithm.array;

public class Solution {

    public void sort(int[] nums, int left, int right) {
        if (left > right){
            return;
        }
        int point = nums[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && nums[j] >= point) {
                j--;
            }
            while (i < j && nums[i] <= point) {
                i++;
            }
            if (i<j){
                swap(nums, i, j);
            }
        }
        swap(nums, i, left);
        sort(nums,left,i-1);
        sort(nums,i+1,right);
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {5, 2, 3, 6, 1, 7, 9, 8};
        solution.sort(nums, 0, nums.length-1);
        for (int num : nums) {
            System.out.println(num);
        }
    }


}
