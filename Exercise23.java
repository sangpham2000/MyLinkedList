public class Exercise23 {
    public static double P(int n) {
        MyStack<Double> s = new MyStack<>();
        s.push(3.0);
        for (int i = 2; i <= n; i++) {
            s.push(Math.pow(2, i) + i*i);
        }
        s.print();
        double sum = 0;
        while(!s.isEmpty()) {
            sum = sum + s.pop();
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(P(1));
        System.out.println(P(2));
        System.out.println(P(3));
        System.out.println(P(4));
    }
}
