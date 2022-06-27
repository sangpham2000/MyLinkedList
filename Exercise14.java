public class Exercise14 {
    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();

        list.addLast(3.0);
        list.addLast(4.5);
        list.addLast(5.6);
        list.addLast(7.7);
        list.addLast(1.7);
        list.print();
        System.out.print(list.findMax());
    }
}
