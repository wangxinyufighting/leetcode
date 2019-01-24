'''
这个题跟其他链表题不太一样，因为没有head。
输入的是要删除的node。
head-4-5-1-9是固定的。
思路：
  所以从要被删除的node本身下手就可以了。
  若要删除node，就只要把node.next.value赋给node.value，
  再把指针node.next.next赋给node.next就可以了。
  
执行用时: 52 ms, 在Delete Node in a Linked List的Python3提交中击败了97.93% 的用户
'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def deleteNode(self, node):
        """
        :type node: ListNode
        :rtype: void Do not return anything, modify node in-place instead.
        """
        node.val = node.next.val
        node.next = node.next.next
