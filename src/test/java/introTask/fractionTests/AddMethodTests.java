package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class AddMethodTests {

    @Test
    public void addCorrectTest() {
        Fraction fraction0 = new Fraction(3, 4);
        Fraction fraction1 = new Fraction(1, 2);

        Fraction actual = fraction0.add(fraction1);

        Fraction expected = new Fraction(5, 4);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void addIncorrectTest() {
        Fraction fraction0 = new Fraction(5, 0);
        Fraction fraction1 = new Fraction(7, 3);

        fraction0.add(fraction1);

        fraction0 = new Fraction(6, 7);
        fraction1 = new Fraction(4, -7);

        fraction0.add(fraction1);
    }

    @Test
    public void addIntegerTest() {
        Fraction fraction0 = new Fraction(3);
        Fraction fraction1 = new Fraction(-4);

        Fraction actualFraction = fraction0.add(fraction1);
        Fraction expectedFraction = new Fraction(-1);

        Assert.assertEquals(expectedFraction, actualFraction);

        fraction0 = new Fraction(5);
        fraction1 = new Fraction(9);

        actualFraction = fraction0.add(fraction1);
        expectedFraction = new Fraction(14);

        Assert.assertEquals(expectedFraction, actualFraction);
    }

    @Test
    public void addNullTest() {
        Fraction fraction0 = new Fraction(5, 8);
        Fraction fraction1 = new Fraction(0);

        Fraction actualFraction = fraction0.add(fraction1);
        Fraction expectedFraction = new Fraction(5, 8);

        Assert.assertEquals(expectedFraction, actualFraction);

        fraction0 = new Fraction(-3, 2);
        fraction1 = new Fraction(0);

        actualFraction = fraction0.add(fraction1);
        expectedFraction = new Fraction(-3, 2);

        Assert.assertEquals(expectedFraction, actualFraction);
    }

    @Test
    public void addAdditivityTest() {
        Fraction fraction0 = new Fraction(15, 16);
        Fraction fraction1 = new Fraction(19, 34);

        Fraction actual0 = fraction0.add(fraction1);
        Fraction actual1 = fraction1.add(fraction0);

        Assert.assertEquals(actual0, actual1);

        fraction0 = new Fraction(-56, 78);
        fraction1 = new Fraction(78, 94);

        actual0 = fraction0.add(fraction1);
        actual1 = fraction1.add(fraction0);

        Assert.assertEquals(actual0, actual1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addOutOfRangeTest() {
        // 2 147 483 647
        Fraction fraction0 = new Fraction(2100000000);
        Fraction fraction1 = new Fraction(2000000000);

        fraction0.add(fraction1);
    }
}
