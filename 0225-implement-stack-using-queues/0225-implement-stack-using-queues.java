class MyStack {
    Queue<Integer> stack = new LinkedList<>();
    public MyStack() {
       
        
    }
    
    public void push(int x) {
        stack.add(x);
        for(int i=0;i<stack.size()-1;i++)
        {
            stack.add(stack.remove());
        }

    }
    
    public int pop() {
        return stack.remove();
        
    }
    
    public int top() {
        return stack.peek();
    }
    
    public boolean empty() {
        
       return stack.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */