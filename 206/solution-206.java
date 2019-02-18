/*
基础的链表问题。

迭代方法有两种
递归方法  
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

//迭代方法1
//执行用时: 0 ms, 在Reverse Linked List的Java提交中击败了100.00% 的用户
//内存消耗: 26.7 MB, 在Reverse Linked List的Java提交中击败了2.62% 的用户

class Solution {
    public ListNode reverseList(ListNode head) {
      if(head == null || head.next == null)
        return head;
      ListNode pre = null;
      ListNode next = null;
      
      while(head != null){
        next = head.next;
        head.next = pre;
        pre = head;
        head = next;
      }
      
      return pre;
    }
}
//迭代方法2
//执行用时: 0 ms, 在Reverse Linked List的Java提交中击败了100.00% 的用户
//内存消耗: 21.3 MB, 在Reverse Linked List的Java提交中击败了64.99% 的用户
class Solution {
    public ListNode reverseList(ListNode head) {
      if(head == null || head.next == null)
        return head;
      ListNode newHead = null;
      
      while(head != null){
        ListNode temp = head;
        head = head.next;
        temp.next = newHead;
        newHead = temp;
      }
      
      return newHead;
    }
}

//递归方法
//执行用时: 1 ms, 在Reverse Linked List的Java提交中击败了19.29% 的用户
//内存消耗: 27.3 MB, 在Reverse Linked List的Java提交中击败了0.98% 的用户
class Solution {
    public ListNode reverseList(ListNode head) {
      if(head == null || head.next == null)
        return head;
      ListNode newHead = reverseList(head.next);
      head = head.next.next;
      head.next = null;
      }
      return newHead;
    }
}
