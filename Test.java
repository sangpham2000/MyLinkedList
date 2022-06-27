public class Test {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addFirst(2);
        list.addFirst(4);
        list.addLast(3);
        list.print();
        list.removeFirst();
        list.print();
    }
}
