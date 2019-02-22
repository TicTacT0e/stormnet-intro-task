package introtask;

public class Fraction implements Comparable<Fraction> {

    private final int numerator;
    private final int denominator;

    private static class Operands {
        private int numerator;
        private int denominator;

        Operands(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        void setNumerator(int numerator) {
            this.numerator = numerator;
        }

        void setDenominator(int denominator) {
            this.denominator = denominator;
        }

        int getNumerator() {
            return numerator;
        }

        int getDenominator() {
            return denominator;
        }
    }

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new ArithmeticException();
        }

        Operands operands = new Operands(numerator, denominator);

        simplify(operands);

        this.numerator = operands.getNumerator();
        this.denominator = operands.getDenominator();
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public final Fraction multiplication(final Fraction fraction) {
        return new Fraction(numerator * fraction.getNumerator(),
                denominator * fraction.getDenominator());
    }

    public final Fraction add(final Fraction fraction) {
        return new Fraction(numerator * fraction.getDenominator()
                + fraction.getNumerator() * denominator,
                denominator * fraction.getDenominator());
    }

    public final Fraction division(final Fraction fraction) {
        if (fraction.getNumerator() == 0) {
            throw new ArithmeticException();
        }

        int resultNumerator = numerator * fraction.getDenominator();
        int resultDenominator = denominator * fraction.getNumerator();
        if (resultDenominator < 0) {
            resultDenominator *= -1;
            resultNumerator *= -1;
        }

        return new Fraction(resultNumerator, resultDenominator);
    }

    public final Fraction subtraction(final Fraction fraction) {
        return new Fraction(numerator * fraction.getDenominator()
                - fraction.getNumerator() * denominator,
                denominator * fraction.getDenominator());
    }

    private void simplify(Operands operands) {
        if (operands.getNumerator() == 0) {
            operands.setDenominator(1);
            return;
        }

        int limit = Math.min(operands.getNumerator(),
                operands.getDenominator());

        for (int i = 2; i <= Math.abs(limit); i++) {
            if ((operands.getNumerator() % i == 0)
                    && (operands.getDenominator() % i == 0)) {
                operands.setNumerator(operands.getNumerator() / i);
                operands.setDenominator(operands.getDenominator() / i);
                simplify(operands);
            }
        }
    }

    private int getNumerator() {
        return numerator;
    }

    private int getDenominator() {
        return denominator;
    }

    @Override
    public final boolean equals(final Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Fraction fraction = (Fraction) object;
        return numerator == fraction.getNumerator()
                && denominator == fraction.getDenominator();
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int hash = 1;
        hash = hash * prime + Integer.hashCode(numerator);
        hash = hash * prime + Integer.hashCode(denominator);
        return hash;
    }

    @Override
    public final String toString() {
        return (denominator == 1) ? "" + numerator
                : numerator + "/" + denominator;
    }

    @Override
    public final int compareTo(final Fraction fraction) {
        if (numerator * fraction.getDenominator() == fraction.getNumerator()
                * denominator) {
            return 0;
        }
        return (numerator * fraction.getDenominator()
                > fraction.getNumerator() * denominator)
                ? 1 : -1;
    }
}
