package introTask;

public class Fraction implements Comparable<Fraction> {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new ArithmeticException();
        }

        this.numerator = numerator;
        this.denominator = denominator;
        simplify(this);
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction multiplication(Fraction fraction) {
        Fraction result = new Fraction(numerator * fraction.getNumerator(),
                denominator * fraction.getDenominator());
        simplify(result);
        return result;
    }

    public Fraction add(Fraction fraction) {
        Fraction result = new Fraction(numerator * fraction.getDenominator() + fraction.getNumerator() * denominator,
                denominator * fraction.getDenominator());
        simplify(result);
        return result;
    }

    public Fraction division(Fraction fraction) {
        if (fraction.getNumerator() == 0) {
            throw new ArithmeticException();
        }

        int resultNumerator = numerator * fraction.getDenominator();
        int resultDenominator = denominator * fraction.getNumerator();
        if (resultDenominator < 0) {
            resultDenominator *= -1;
            resultNumerator *= -1;
        }
        Fraction result = new Fraction(resultNumerator, resultDenominator);
        simplify(result);
        return result;
    }

    public Fraction subtraction(Fraction fraction) {
        Fraction result = new Fraction(numerator * fraction.getDenominator() - fraction.getNumerator() * denominator,
                denominator * fraction.getDenominator());
        simplify(result);
        return result;
    }

    private void simplify(Fraction fraction) {
        if (fraction.getNumerator() == 0) {
            fraction.setDenominator(1);
            return;
        }

        int limit = Math.min(fraction.getNumerator(), fraction.getDenominator());

        for (int i = 2; i <= Math.abs(limit); i++) {
            if ((fraction.getNumerator() % i == 0) && (fraction.getDenominator() % i == 0)) {
                fraction.setNumerator(fraction.getNumerator() / i);
                fraction.setDenominator(fraction.getDenominator() / i);
                simplify(fraction);
            }
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Fraction fraction = (Fraction) object;
        return numerator == fraction.getNumerator() && denominator == fraction.getDenominator();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hash = 1;
        hash = hash * prime + Integer.hashCode(numerator);
        hash = hash * prime + Integer.hashCode(denominator);
        return hash;
    }

    @Override
    public String toString() {
        return (denominator == 1) ? "" + numerator :
                numerator + "/" + denominator;
    }

    @Override
    public int compareTo(Fraction fraction) {
        if (numerator * fraction.getDenominator() == fraction.getNumerator() * denominator) {
            return 0;
        }
        return (numerator * fraction.getDenominator() > fraction.getNumerator() * denominator) ?
                1 : -1;
    }
}
