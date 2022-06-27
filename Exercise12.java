public class Exercise12 {
    public static void main(String[] args) {
        MyLinkedList<Fraction> list = new MyLinkedList<>();
        list.addFirst(new Fraction(3, 5));
        list.addFirst(new Fraction(2, 6));
        list.addFirst(new Fraction(3, 7));
        list.addFirst(new Fraction(2, 8));
        list.print();
        list.removeCurr(list.getHead());
        list.print();
    }
}
