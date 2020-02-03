package com.company;

public class MoveZerosReview {

    public static void main(String[] args) {
        MoveZerosReview t = new MoveZerosReview();
        int[] array ={0,1,0,3,12};;//{0,1,0,3,12};

        t.move(array);
        for (int i = 0; i <array.length; i++) {
            System.out.println(array[i]);
        }

    }

    public void move(int[] nums){
       int j=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                if(i!=j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

}
