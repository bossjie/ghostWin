package com.company;

public class rotateArrayWithReverse {
    /*
    *   输入: [1,2,3,4,5,6,7] 和 k = 3
    *   输出: [5,6,7,1,2,3,4]
    * */
    public static void main(String[] args) {
        int [] test1 = {1,2,3,4,5,6,7};
        System.out.println("src2:");
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i]+" ");
        }
        System.out.println("");
        rotate(test1,4);
        System.out.println("final result2:");
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i]+" ");
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }

    private static void reverse(int[] nums, int start,int end){
        int temp = 0;
        while(start < end){
             temp = nums[start];
             nums[start++] = nums[end];
             nums[end--] = temp;
        }
    }
}






