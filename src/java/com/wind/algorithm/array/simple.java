package com.wind.algorithm.array;//package com.wind.algorithm.array;
//
//import java.util.Arrays;
//
//
//public class simple {
//    /**
//     * 217. 存在重复元素
//     * 给定一个整数数组，判断是否存在重复元素。
//     * 如果存在 值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
//     */
//    public boolean containsDuplicate(int[] nums) {
//        if (nums.length == 0){
//            return false;
//        }
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//           if (nums[i]==nums[i+1]){
//               return true;
//           }
//        }
//        return false;
//    }
//    /**
//     * 53. 最大子数组和
//     *给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
//     * 子数组 是数组中的一个连续部分。
//     *
//     */
//    public int maxSubArray(int[] nums) {
//        int result = nums[0];
//        int temp = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] >result){
//               result = nums[i];
//            }else{
//
//            }
//        }
//
//    }
//}
