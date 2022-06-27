

public class Fraction{
    private int numer;
    private int denom;

    public Fraction() {}

    public Fraction(int x, int y) {
        if (y == 0){
            System.out.println("Denominator must be greater than 0");
        } else {
            this.numer = x;
            this.denom = y;
        }
    }

    public Fraction(Fraction f) {
        this.numer = f.numer;
        this.denom = f.denom;
    }

    public String toString() {
        return String.format("%d/%d", this.numer, this.denom);
    }

    public boolean equals(Object f) {
        if (f instanceof Fraction) {
            Fraction g = (Fraction) f;
            return numer * g.denom - denom * g.numer == 0;
        }
        return false;
    }
}
