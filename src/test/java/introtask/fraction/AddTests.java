package introtask.fraction;

import introtask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class AddTests {

    @Test
    public void addCorrectData() {
        Fraction actual =
                new Fraction(3, 4).add(new Fraction(1, 2));

        Fraction expected = new Fraction(5, 4);

        Assert.assertTrue(expected.getNumerator()
                == actual.getNumerator());
        Assert.assertTrue(expected.getDenominator()
                == actual.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void addIncorrectData() {
        new Fraction(5, 0);
    }

    @Test
    public void addInteger() {
        Fraction actual = new Fraction(3).add(new Fraction(-4));

        Fraction expected = new Fraction(-1);

        Assert.assertTrue(expected.getNumerator()
                == actual.getNumerator());
    }

    @Test
    public void addNull() {
        Fraction actual = new Fraction(5, 8).add(new Fraction(0));

        Fraction expected = new Fraction(5, 8);

        Assert.assertTrue(expected.getNumerator()
                == actual.getNumerator());
        Assert.assertTrue(expected.getDenominator()
                == actual.getDenominator());
    }

    @Test
    public void addAdditivity() {
        Fraction fraction0 = new Fraction(15, 16);
        Fraction fraction1 = new Fraction(19, 34);

        Fraction actualFirst = fraction0.add(fraction1);
        Fraction actualSecond = fraction1.add(fraction0);

        Assert.assertTrue(actualFirst.getNumerator()
                == actualSecond.getNumerator());
        Assert.assertTrue(actualFirst.getDenominator()
                == actualSecond.getDenominator());
    }

    @Test
    public void addEdgeValues() {
        Fraction fraction0 = new Fraction(-1);
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(0);

        Fraction actual = fraction0.add(fraction1);

        Assert.assertTrue(actual.getNumerator()
                == fraction2.getNumerator());
        Assert.assertTrue(actual.getDenominator()
                == fraction2.getDenominator());
    }

}

