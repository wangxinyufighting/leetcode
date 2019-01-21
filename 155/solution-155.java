/*
使用两个栈来解决这个问题。
stackData和stackMin
其中，stackData即是用来实现栈的基本操作；
stackMin用来解决找到最小值的问题，具体的操作即是在push的过程中，始终保证新压入栈的元素一定比原来栈顶元素要小。
即若小，则push，若大于，则不push。这样，最小值即是stackMin的栈顶元素了。

pop操作中，若stackData的栈顶元素和stackMin的栈顶元素一样时，那两者都要pop；
不然只stackData pop就可以了。此举为了保证pop完后，最小值仍是栈中元素。
  
*/
//思路1
class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> stackData = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();
    
    public MinStack() {
    }
    
    public void push(int x) {
         if(stackMin.isEmpty())
            stackMin.push(x);
        else{
            if(x <= stackMin.peek())
                stackMin.push(x);
            else
                stackMin.push(stackMin.peek());
        }
        stackData.push(x);
    }
    
    public void pop() {
        stackData.pop();
        stackMin.pop();
    }
    
    public int top() {
        return stackData.peek();
        
    }
    
    public int getMin() {
        return stackMin.peek();
    }
}


//思路2
class MinStack {
    /** initialize your data structure here. */
    Stack<Integer> stackData = new Stack<>();
    Stack<Integer> stackMin = new Stack<>();
    
    public MinStack() {
    }
    
    public void push(int x) {
         if(stackMin.isEmpty())
            stackMin.push(x);
        else{
            if(x <= stackMin.peek())
                stackMin.push(x);//这里和思路1不一样
        }
        stackData.push(x);
    }
    
    public void pop() {
        int temp = stackData.pop();
        if(temp == stackMin.peek())//这里和思路1不一样
            stackMin.pop();
    }
    
    public int top() {
        return stackData.peek();
        
    }
    
    public int getMin() {
        return stackMin.peek();
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
