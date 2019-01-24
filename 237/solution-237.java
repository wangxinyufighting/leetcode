/*
这个题跟其他链表题不太一样，因为没有head。
输入的是要删除的node。
head-4-5-1-9是固定的。
思路：
  所以从要被删除的node本身下手就可以了。
  若要删除node，就只要把node.next.value赋给node.value，
  再把指针node.next.next赋给node.next就可以了。
*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
