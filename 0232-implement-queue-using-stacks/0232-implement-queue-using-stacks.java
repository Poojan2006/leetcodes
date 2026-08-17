class MyQueue {
    Stack<Integer> queue1 = new Stack<>();
    Stack<Integer> queue2 = new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        while(!queue1.isEmpty())
            queue2.push(queue1.pop());
        queue1.push(x);
        while(!queue2.isEmpty())
            queue1.push(queue2.pop());
        
    }
    
    public int pop() {
        return queue1.pop();

        
    }
    
    public int peek() {
        return queue1.peek();
        
    }
    
    public boolean empty() {
        return queue1.isEmpty();
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */