public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {

        if (denominator < 0) {
            numerator = -1 * numerator;
            denominator = -1 * denominator;
        }

        int a;
        if (numerator < 0) {
            a = -1 * numerator;
        } else {
            a = numerator;
        }
        int b = denominator;
        while (b != 0) {
            int x = b;
            b = a % b;
            a = x;
        }
        int nod = a;

        this.numerator = numerator / nod;
        this.denominator = denominator / nod;
    }

    public String toString() {
        if (denominator == 1) {
            return Integer.toString(numerator);
        }
        return numerator + "/" + denominator;
    }

    public Fraction sum(Fraction other) {
        int newnumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newdenominator = this.denominator * other.denominator;
        return new Fraction(newnumerator, newdenominator);
    }

    public Fraction minus(Fraction other) {
        int newnumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newdenominator = this.denominator * other.denominator;
        return new Fraction(newnumerator, newdenominator);
    }

    public Fraction multiply(Fraction other) {
        int newnumerator = this.numerator * other.numerator;
        int newdenominator = this.denominator * other.denominator;
        return new Fraction(newnumerator, newdenominator);
    }

    public Fraction div(Fraction other) {
        int newnumerator = this.numerator * other.denominator;
        int newdenominator = this.denominator * other.numerator;
        return new Fraction(newnumerator, newdenominator);
    }

    public Fraction sum(int number) {
        return this.sum(new Fraction(number, 1));
    }

    public Fraction minus(int number) {
        return this.minus(new Fraction(number, 1));
    }

    public Fraction multiply(int number) {
        return this.multiply(new Fraction(number,1));
    }

    public Fraction div(int number) {
        return this.div(new Fraction(number, 1));
    }
}
