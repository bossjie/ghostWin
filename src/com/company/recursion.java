package com.company;

public class recursion {

    public static void main(String[] args) {
        int result = new recursion().recTest(3);
        System.out.println(result);
    }

    public int recTest(int i){
        if(i!=1){
           i = i*recTest(i-1);
        }
        return i;
    }

}
