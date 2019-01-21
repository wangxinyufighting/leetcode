'''

'''
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
        


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()
