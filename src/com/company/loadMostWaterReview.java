package com.company;

public class loadMostWaterReview {

    public static void main(String[] args) {

        loadMostWaterReview t = new loadMostWaterReview();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(t.calculate2(height));

    }
    //2.**双指针夹逼**
    public int calculate2(int[] height){
        int maxResult=0;
        int leftBorder = 0,rightBorder=height.length-1;
        while(leftBorder<rightBorder){
            int minHeight =Math.min(height[leftBorder],height[rightBorder]);
            maxResult = Math.max(maxResult,(rightBorder-leftBorder)*minHeight);
            if(height[leftBorder]<height[rightBorder]){
                leftBorder++;
            }else{
                rightBorder--;
            }

        }

        return maxResult;
    }

}
