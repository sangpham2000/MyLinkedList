public class Exercise13 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(9);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.print();
        System.out.println("a) There are all " + list.countEven() + " even numbers");
        System.out.println("b) There are all " + list.countPrime() + " prime numbers");
        System.out.print("c) ");
        list.addItemBeforeEven(100);
        list.print();
        System.out.println("d) The maximum number is " + list.findMax());
        list.sortList();
        System.out.print("f) Sort ");
        list.print();
    }
}
