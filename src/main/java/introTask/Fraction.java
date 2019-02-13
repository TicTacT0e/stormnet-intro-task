package introTask;

public class Fraction implements Comparable<Fraction> {

    private long numerator;
    private long denominator;

    Fraction() {
    }

    Fraction(long numerator, long denominator) {
        if (denominator == 0 || denominator < 0)
            throw new ArithmeticException();

        this.numerator = numerator;
        this.denominator = denominator;
    }

    Fraction(long numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    public Fraction multiplication(Fraction fraction) {

        Fraction result = new Fraction(this.numerator * fraction.getNumerator(), this.denominator * fraction.getDenominator());
        simplify(result);
        return result;
    }

    public Fraction add(Fraction fraction) {

        Fraction result = new Fraction(this.numerator * fraction.getDenominator() + fraction.getNumerator() * this.denominator,
                this.denominator * fraction.getDenominator());
        simplify(result);
        return result;
    }

    public Fraction division(Fraction fraction) {

        long resultNumerator = this.numerator * fraction.getDenominator();
        long resultDenominator = this.denominator * fraction.getNumerator();
        if (resultDenominator < 0) {
            resultDenominator *= -1;
            resultNumerator *= -1;
        }
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        simplify(result);
        return result;
    }

    public Fraction subtraction(Fraction fraction) {

        Fraction result = new Fraction(this.numerator * fraction.getDenominator() - fraction.getNumerator() * this.denominator,
                this.denominator * fraction.getDenominator());
        simplify(result);
        return result;
    }

    public void simplify(Fraction fraction) {

        if (fraction.getNumerator() == 0) {
            fraction.setDenominator(1);
            return;
        }

        long limit = Math.min(fraction.getNumerator(), fraction.getDenominator());

        for (long i = 2; i <= Math.abs(limit); i++) {
            if ((fraction.getNumerator() % i == 0) && (fraction.getDenominator() % i == 0)) {
                fraction.setNumerator(fraction.getNumerator() / i);
                fraction.setDenominator(fraction.getDenominator() / i);
                simplify(fraction);
            }
        }
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public void setNumerator(long numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(long denominator) {
        if (denominator == 0 || denominator < 0)
            throw new ArithmeticException();
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null || this.getClass() != object.getClass()) return false;
        Fraction fraction = (Fraction) object;
        return this.numerator == fraction.getNumerator() && this.denominator == fraction.getDenominator();
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int hash = 1;
        hash = hash * prime + Long.hashCode(this.numerator);
        hash = hash * prime + Long.hashCode(this.denominator);
        return hash;
    }

    @Override
    public String toString() {

        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public int compareTo(Fraction fraction) {

        if (this.numerator * fraction.getDenominator() == fraction.getNumerator() * this.denominator)
            return 0;
        return (this.numerator * fraction.getDenominator() > fraction.getNumerator() * this.denominator) ?
                1 : -1;
    }
}
