package com.company;

import java.util.Stack;

public class MinStack {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
    //同步辅助栈,保存最小值到辅助栈(新元素不是最小时,重复插入栈顶元素充个数) 双进双出来tongbu
    private Stack<Integer> data;
    private Stack<Integer> helper;

    public MinStack() {
        data = new Stack<Integer>();
        helper = new Stack<Integer>();
    }

    public void push(int x) {
        data.add(x);
        if(helper.isEmpty() || helper.peek()>=x){ //这里要包含等于
            helper.add(x);
        }else{
            helper.add(helper.peek());
        }
    }

    public void pop() {
        if(data.isEmpty()) throw new RuntimeException("stack is empty");
        data.pop();
        helper.pop();
    }

    public int top() {
        if(data.isEmpty()) throw new RuntimeException("stack is empty");
        return data.peek();
    }

    public int getMin() {
        if(data.isEmpty()) throw new RuntimeException("stack is empty");
        return helper.peek();
    }

}
