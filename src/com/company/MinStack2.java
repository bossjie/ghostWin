package com.company;

import java.util.Stack;

public class MinStack2 {

    public static void main(String[] args) {
        MinStack2 minStack = new MinStack2();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        //minStack.push(-3);
        //System.out.println(minStack.getMin());
        minStack.pop();

        //System.out.println(minStack.top());
        //System.out.println(minStack.getMin());
    }

    int min = Integer.MAX_VALUE;
    Stack<Integer> stack = new Stack<Integer>();
    public void push(int x) {
        //当前值更小
        if(x <= min){
            //将之前的最小值保存
            stack.push(min);
            //更新最小值
            min=x;
        }
        stack.push(x);
    }

    public void pop() {
        //如果弹出的值是最小值，那么将下一个元素更新为最小值
        if(stack.pop() == min) {
            min=stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        if(stack.isEmpty()){
            throw new RuntimeException("empty stack");
        }
        return min;
    }

}
