package com.company;

public class rotateArray {
    /*
    *   输入: [1,2,3,4,5,6,7] 和 k = 3
    *   输出: [5,6,7,1,2,3,4]
    * */
    public static void main(String[] args) {
        int [] test1 = {1,2,3,4,5,6,7};
        System.out.println("src:");
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i]+" ");
        }
        System.out.println("");
        rotate(test1,1);
        System.out.println("final result:");
        for (int i = 0; i < test1.length; i++) {
            System.out.print(test1[i]+" ");
        }
    }

    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        for (int i = 0; i < k; i++) {
            int movingValue = nums[nums.length-1];
            for (int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];//move one step to right for each element
            }
            nums[0] = movingValue;
        }
    }
}





