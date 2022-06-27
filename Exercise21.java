public class Exercise21 {
    public static void main(String[] args) {
        MyStack<Fraction> s = new MyStack<>();
        s.push(new Fraction(2, 4));
        s.push(new Fraction(3, 4));
        s.push(new Fraction(4, 4));
        s.print();
        System.out.println(s.pop());
        s.print();
    }
}
