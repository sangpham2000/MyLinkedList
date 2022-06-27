public class Exercise11 {
    public static void main(String[] args) {
        MyLinkedList<Fraction> list = new MyLinkedList<>();
        list.addFirst(new Fraction(3, 5));
        list.addFirst(new Fraction(2, 6));
        list.addFirst(new Fraction(5, 6));
        list.addFirst(new Fraction(6, 6));
        list.addFirst(new Fraction(7, 6));
        list.print();
        System.out.println(list.getHead().getData());
        list.print();
    }
}
