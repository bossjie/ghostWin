package com.company;

/**
 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 示例：
 输入：1->2->4, 1->3->4
 输出：1->1->2->3->4->4
 */


class mergeTwoSortedList {
    /*public static void main(String[] args){
        new mergeTwoSortedList().mergeTwoLists();
    }*/

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode preheader = new ListNode(-1);
        ListNode prev = preheader;

        while(l1 !=null && l2 != null){ //my code: 先对1&0 和0&1做特殊处理, 然后再while里判断x.next
            if(l1.val <= l2.val){      //其实不用, 结合这个while和L30的判断,包括了 两个corner cases.
                prev.next = l1;        // ==>corner case可以先列出来, 写完循环后再看看是否可以cover部分
                l1 = l1.next;
            }else{
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next; //!!! 链表里元素的循环后移, 在这里 next的指向确保了元素仍然保留了处理过的元素,而不是跳过
        }
        prev.next= l1==null?l2:l1;
        return preheader.next;
    }

    public ListNode mergeTwoListsS2(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val<=l2.val){
            l1.next = mergeTwoListsS2(l1.next,l2);
            return l1;
        }
        l2.next = mergeTwoListsS2(l1,l2.next);
        return l2;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
}
