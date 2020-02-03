package com.company;

public class TwoSum {

    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = t.fun(nums, target);
        if(result==null){
            System.out.println("cannot find the couple");
            return;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] fun(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j]==target){
                    int[] result = {nums[i],nums[j]};
                    return result;
                }
            }
        }
        return null;
    }

}
