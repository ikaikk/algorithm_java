import java.util.Stack;

/**
 * 力扣232，使用栈实现队列
 */
public class MyQueue {
    private final Stack<Integer> inStack;
    private final Stack<Integer> outStack;

    public MyQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void push(int x) {
        inStack.push(x);
    }

    public int pop() {
        if (outStack.isEmpty()) {
            push2Out();
        }

        return outStack.pop();
    }

    private void push2Out() {
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }
    }

    public int peek() {
        if (outStack.isEmpty()) {
            push2Out();
        }

        return outStack.peek();
    }

    public boolean empty() {
        return outStack.isEmpty() && inStack.isEmpty();
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);

        System.out.println(myQueue.empty());
        System.out.println(myQueue.pop());
        System.out.println(myQueue.peek());

    }
}
