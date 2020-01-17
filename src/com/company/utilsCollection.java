package com.company;

public class utilsCollection {

    public static void main(String[] args) {
        int [] nums = {1,2,3};
        int [] destionNums = new int[2];
        System.arraycopy(nums,0,destionNums,0,3);
        for (int i = 0; i < destionNums.length; i++) {
            System.out.print(destionNums[i]+" ");
        }
        System.out.println("");
    }

}
