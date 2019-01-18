'''
leetcode显示耗时：52ms
已经战胜 99.74 % 的 python3 提交记录

思路：
    利用set函数，将nums变成集合，即去除nums中重复的元素。
    对比处理前后的nums，若长度相等则没有重复元素，返回false；否则，返回true。
'''
class Solution:
    def containsDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        if len(set(nums))!=len(nums):
            return True
        else:
            return False
