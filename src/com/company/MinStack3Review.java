package com.company;

public class MinStack3Review {

    public static void main(String[] args) {
        MinStack3Review minStack = new MinStack3Review();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();

        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
    public void push(int x) {

    }

    public void pop() {

    }

    public int top() {
    return 1;
    }

    public int getMin() {
return 1;
    }

}
