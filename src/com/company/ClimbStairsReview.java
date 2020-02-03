package com.company;

public class ClimbStairsReview {
    //懵逼时, 首先可以想暴力法, 罗列基本情况
    //!!!!!其次, 找最近重复子问题  最近: 从简单小数据开始草稿纸演算 归纳规律   因为计算机不就是ifelse, for while和recursion

    public static void main(String[] args) {
        ClimbStairsReview t = new ClimbStairsReview();
        System.out.println(t.fun(4));
    }
    public int fun(int num){
        int first=1,second=2,third=0;
        if(num<=2){
            second = num;
        }
        for (int i = 3; i <= num; i++) {
            third = first+second;
            first = second;
            second = third;
        }
        return second;
    }

}
