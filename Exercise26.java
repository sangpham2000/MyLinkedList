public class Exercise26 {
    public static void main(String[] args) {
        QueueUsingStack q = new QueueUsingStack();
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.print();
        System.out.println(q.deQueue());
        q.print();
        System.out.println(q.deQueue());
        q.print();
    }
}
