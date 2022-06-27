public class QueueUsingStack {
    MyStack<Integer> s1 = new MyStack<>();
    MyStack<Integer> s2 = new MyStack<>();
    public void enQueue(int num) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        // Push item into s1
        s1.push(num);

        // Push everything back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int deQueue()
    {
        // if first stack is empty
        if (s1.isEmpty())
        {
            System.out.println("Q is Empty");
            System.exit(0);
        }
 
        // Return top of s1
        int x = s1.getPeek();
        s1.pop();
        return x;
    }

    public void print() {
        s1.print();
    }
}
