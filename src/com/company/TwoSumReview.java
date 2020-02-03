package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumReview {

    public static void main(String[] args) {
        TwoSumReview t = new TwoSumReview();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = t.fun(nums, target);
        if(result == null){
            return;
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public int[] fun(int[] nums, int target){
        Arrays.sort(nums);
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int i = 0; i < nums.length ; i++) {

            int leftBorder=i,rightBorder= nums.length-1;
            if(nums[leftBorder]>=target || nums[leftBorder] == nums[leftBorder+1]){ continue; }

            while(leftBorder<rightBorder){
                int result = target - nums[leftBorder]-nums[rightBorder];//??
                if(result>0){
                    rightBorder = nums[rightBorder]==nums[--rightBorder]?--rightBorder:rightBorder;
                    System.out.println(rightBorder);
                }else if(result<0){
                    //jump out
                    rightBorder = leftBorder;
                    //leftBorder = nums[leftBorder]==nums[++leftBorder]?++leftBorder:leftBorder;
                }else{
                    System.out.println(111);
                    map.put(nums[leftBorder],nums[rightBorder]);
                }
            }
        }
        System.out.println("sss");
        System.out.println(map);
        return null;
    }

}
