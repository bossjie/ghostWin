package com.company;

public class removeDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int [] test1 = {0,0,1,1,1,2,2,3,3,4,7};
        int num = removeDuplicates(test1);
        System.out.println("final result:");
        for (int i = 0; i < num; i++) {
            System.out.println(test1[i]);
        }
    }

    public static int removeDuplicates(int[] nums){
        int len = nums.length;
        if(len<=1){
            return len;
        }
        int countingIndex = 1;
        for(int i=1;i<len;i++){
            if(nums[i]!=nums[i-1]){
                nums[countingIndex] = nums[i];
                countingIndex++;
            }
        }
        return countingIndex;
    }
}



