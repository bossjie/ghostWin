package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum t = new ThreeSum();
        int[] nums = {-1, 0, 1, 1, -1,};
        List<List<Integer>> result = t.threeSum(nums);
        System.out.println(result);
    }

    //sort+双指针夹逼法
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        //1. sort 2. 如果nums[k] ==num[k-1] 跳过  这里非常巧妙, 不是和k+1比
        //3.while i<j, j--,i++
        Arrays.sort(nums);
        for (int k=0; k < nums.length-2; k++) {
            if(nums[k]>0) return result;
            if(k>0 && nums[k]==nums[k-1]) continue;
            int i=k+1;//注意重新赋值
            int j=nums.length-1;//注意重新赋值
            while(i<j){
                int sum = nums[k]+nums[i]+nums[j];
                if(sum>0){
                    while(i<j && nums[j]==nums[--j]);//借助排序的基础,去掉重复项!!!
                }else if(sum<0){
                    while(i<j && nums[i]==nums[++i]);//去掉重复项
                }else{
                    result.add(Arrays.asList(nums[k],nums[i],nums[j]));
                    while(i<j && nums[i]==nums[++i]);//去掉重复项
                    while(i<j && nums[j]==nums[--j]);//去掉重复项
                }
            }
        }

        return result;
    }

}
