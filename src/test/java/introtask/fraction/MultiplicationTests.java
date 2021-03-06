package introtask.fraction;

import introtask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTests {

    @Test
    public void multiplicationCorrectData() {
        Fraction actual =
                new Fraction(2, 3).multiplication(new Fraction(1, 4));

        Fraction expected = new Fraction(1, 6);

        Assert.assertTrue(expected.getNumerator() == actual.getNumerator());
        Assert.assertTrue(expected.getDenominator() == actual.getDenominator());
    }

    @Test
    public void multiplicationInteger() {
        Fraction actual =
                new Fraction(5).multiplication(new Fraction(4));

        Fraction expected = new Fraction(20);

        Assert.assertTrue(expected.getNumerator()
                == actual.getNumerator());
        Assert.assertTrue(expected.getDenominator()
                == actual.getDenominator());
    }

    @Test
    public void multiplicationNull() {
        Fraction actual =
                new Fraction(5, 8).multiplication(new Fraction(0));

        Fraction expected = new Fraction(0);

        Assert.assertTrue(expected.getNumerator()
                == actual.getNumerator());
        Assert.assertTrue(expected.getDenominator()
                == actual.getDenominator());
    }

    @Test
    public void multiplicationAdditivity() {
        Fraction fraction0 = new Fraction(5, 7);
        Fraction fraction1 = new Fraction(8, 9);

        Fraction actualFirst = fraction0.multiplication(fraction1);
        Fraction actualSecond = fraction1.multiplication(fraction0);

        Assert.assertTrue(actualFirst.getNumerator()
                == actualSecond.getNumerator());
        Assert.assertTrue(actualFirst.getDenominator()
                == actualSecond.getDenominator());
    }

    @Test
    public void multiplicationEdgeValues() {
        Fraction fraction0 = new Fraction(-1);
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(0);

        Assert.assertTrue(0
                == fraction1.multiplication(fraction2).getNumerator());
        Assert.assertTrue(-1
                == fraction1.multiplication(fraction0).getNumerator());
    }
}
