package com.company;

import java.util.HashSet;
import java.util.Set;

public class HasCycle {

    public static void main(String[] args) {
        HasCycle t = new HasCycle();
    }


    //快慢指针, 快指针总会碰到A情况: 落后慢指针1/2步,相遇则有环
    public boolean hasCycle3(ListNode head){
        ListNode walker = head;
        ListNode runner = head;
        while(runner!=null && runner.next !=null){
            walker = walker.next;
            runner = runner.next.next;
            if(walker==runner){
                return true;
            }
        }
        return false;
    }

    //快慢指针, 快指针总会碰到A情况: 落后慢指针1/2步,相遇则有环
    public boolean hasCycle2(ListNode head){
        if(head==null || head.next==null) return false; //边界条件
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow!=fast){
            if(fast==null || fast.next==null){
                return false;//到达末端   边界条件
            }
            slow=slow.next;//一步步走     重复子单元
            fast = fast.next.next;//两步走
        }
        return true;
    }


    //利用hashset 来判断是否有重复的,知道末尾,有就找到了
    public boolean hasCycle(ListNode head){
        Set<ListNode> set = new HashSet<ListNode>();
        while(head!=null){
            if(set.contains(head)){
                return true;
            }else{
                set.add(head);
                head = head.next;
            }
        }
        return false;
    }

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }

}
