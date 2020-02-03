package com.company;

public class loadMostWater {

    public static void main(String[] args) {

        loadMostWater t = new loadMostWater();
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(t.calculate2(height));

    }
    //2.**双指针夹逼**
    public int calculate2(int[] height){
        int leftBorder = 0, rightBorder = height.length - 1, maxArea = 0; //别数组越界
        while(leftBorder < rightBorder){
            maxArea = height[leftBorder] < height[rightBorder] ?
                    Math.max(maxArea, (rightBorder - leftBorder) * height[leftBorder++]):
                    Math.max(maxArea, (rightBorder - leftBorder) * height[rightBorder--]);
        }
        return maxArea;

    }

    //1.暴力循环 得出最大值
    public int calculate(int[] height){
        int maxResult = 0;
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {
                area = (j-i)*Math.min(height[i],height[j]);
                maxResult = Math.max(area,maxResult);
            }
        }
        return maxResult;
    }

}
