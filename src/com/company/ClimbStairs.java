package com.company;

public class ClimbStairs {
    //懵逼时, 首先可以想暴力法, 罗列基本情况
    //!!!!!其次, 找最近重复子问题  最近: 从简单小数据开始草稿纸演算 归纳规律   因为计算机不就是ifelse, for while和recursion

    public static void main(String[] args) {
        ClimbStairs t = new ClimbStairs();
        System.out.println(t.fun(44));
    }

    public int fun(int n){
        if(n==1) return 1;
        int first =1,second=2;
        for (int i = 3; i <=n; i++) {   //顺序斐波那契写法,减少了递归调用大量的effort
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
/*
        递归写法 但是leetcode超时了 运行结果ok的
        if(n==2) return 2;
        if(n==1) return 1;
        return hasCycle(n-1)+hasCycle(n-2);
        下面是缓存功能的递归
        class Solution {
     Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if (n == 1) {
            map.put(1, 1);
            return 1;
        }
        if (n == 2) {
            map.put(2, 2);
            return 2;
        }
        if (map.get(n) != null) {    !!
            return map.get(n);
        } else {
            int result = climbStairs(n - 1) + climbStairs(n - 2);
            map.put(n, result); !!
            return result;
         }
        }
    }
*/
    }

}
//
//    public int hasCycle(int n){
//        if(n==1) return 1;
//        int first =1,second=2;
//        for (int i = 3; i <=n; i++) {
//            int third = first + second;
//            first = second;
//            second = third;
//        }
//        return second;
//    }  1134903170
