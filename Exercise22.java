public class Exercise22 {

    public static void main(String[] args) {
        MyQueue<Fraction> q = new MyQueue<>();
        q.enQueue(new Fraction(2, 4));
        q.enQueue(new Fraction(3, 4));
        q.enQueue(new Fraction(4, 4));
        System.out.println(q.deQueue());
        q.print();
    }
}
