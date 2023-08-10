class MyQueue {
    Stack<Integer> stack1=new Stack<Integer>();
    Stack<Integer> stack2=new Stack<Integer>();
    int k=1;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int k=stack2.pop();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return k;
    }
    
    public int peek() {
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int k=stack2.peek();
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return k;
    }
    
    public boolean empty() {
        if(stack1.isEmpty())
        return true;
        return false;
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
