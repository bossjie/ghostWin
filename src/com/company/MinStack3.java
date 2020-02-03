package com.company;

public class MinStack3 {

    public static void main(String[] args) {
        MinStack3 minStack = new MinStack3();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();

        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
//创建一个数据结构(用链表来做栈),保存每次压栈后的最小值
    class Node {
        int value;
        int min;
        Node next;
        Node( int value, int min){
            this.value = value;
            this.min = min;
        }
    }
    Node head;
    public void push(int x) {
        if(head==null){
            head = new Node(x,x);
        }else{
            Node n = new Node(x,Math.min(x,head.min));
            n.next = head;
            head = n;
        }
    }

    public void pop() {
        if(head!=null){
            head = head.next;
        }
        throw new RuntimeException("stack is empty");
    }

    public int top() {
        if(head!=null){
            return head.value;
        }
        throw new RuntimeException("stack is empty");
    }

    public int getMin() {
        if(head!=null){
            return head.min;
        }
        throw new RuntimeException("stack is empty");
    }

}
