class MinStack {
    Stack<Integer> mainStack,minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    } 
    public void push(int value) {
        mainStack.push(value);
        if(minStack.isEmpty() || value<=minStack.peek())
            minStack.push(value);   
    }
    public void pop() {
       int r = mainStack.pop();
       if(r == minStack.peek())
            minStack.pop();
    }
    public int top() {
        return mainStack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}