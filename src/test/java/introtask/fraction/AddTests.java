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

        Assert.assertEquals(expected, actual);

    }

    @Test(expected = ArithmeticException.class)
    public void addIncorrectData() {
        new Fraction(5, 0);
    }

    @Test
    public void addInteger() {
        Fraction actual = new Fraction(3).add(new Fraction(-4));

        Fraction expected = new Fraction(-1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addNull() {
        Fraction actual = new Fraction(5, 8).add(new Fraction(0));

        Fraction expected = new Fraction(5, 8);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addAdditivity() {
        Fraction fraction0 = new Fraction(15, 16);
        Fraction fraction1 = new Fraction(19, 34);

        Fraction actualFirst = fraction0.add(fraction1);
        Fraction actualSecond = fraction1.add(fraction0);

        Assert.assertEquals(actualFirst, actualSecond);
    }

    @Test
    public void addEdgeValues() {
        Fraction fraction0 = new Fraction(-1);
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(0);

        Assert.assertEquals(fraction0.add(fraction1), fraction2);
    }

}

