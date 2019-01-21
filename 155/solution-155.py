'''
java中可以使用两个栈来解决这个问题。
在python中没有封装好的stack，用两个list：data，min来替代
list没有后进先出的性质。因此需要注意。
因此，top操作要返回最后一个值。
list的pop的方法时弹出list的最后一个值，这个可以直接用。

其中，data即是用来实现栈的基本操作；
min用来解决找到最小值的问题，具体的操作即是在push的过程中，始终保证新压入栈的元素一定比原来栈顶元素要小。
即若小，则push，若大于，则不push。这样，最小值即是min的栈顶元素了。
pop操作中，若data的栈顶元素和min的栈顶元素一样时，那两者都要pop；
不然只data pop就可以了。此举为了保证pop完后，最小值仍是栈中元素。

注意：
思路1：执行用时: 88 ms, 在Min Stack的Python3提交中击败了67.69% 的用户
思路2：执行用时: 68 ms, 在Min Stack的Python3提交中击败了98.54% 的用户
'''

#思路1
class MinStack:
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.data = []
        self.min = []
        

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        if self.min == []:
            self.min.append(x)
        else:
            if self.min[-1] >= x:
                self.min.append(x)
            else:
                self.min.append(self.min[-1])
        
        self.data.append(x)
        

    def pop(self):
        """
        :rtype: void
        """
        # if self.data[-1] == self.min[-1]:
        self.min.pop()
        self.data.pop()
        

    def top(self):
        """
        :rtype: int
        """
        return self.data[-1]
        

    def getMin(self):
        """
        :rtype: int
        """
        return self.min[-1]
 
#思路2
class MinStack:
    def __init__(self):
        """
        initialize your data structure here.
        """
        self.data = []
        self.min = []
        

    def push(self, x):
        """
        :type x: int
        :rtype: void
        """
        if self.min == []:
            self.min.append(x)
        else:
            if self.min[-1] >= x:
                self.min.append(x)
                
        self.data.append(x)
        

    def pop(self):
        """
        :rtype: void
        """
        if self.data[-1] == self.min[-1]:
            self.min.pop()
        self.data.pop()
        

    def top(self):
        """
        :rtype: int
        """
        return self.data[-1]
        

    def getMin(self):
        """
        :rtype: int
        """
        return self.min[-1]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
