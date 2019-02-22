package introtask.fractionTests;

import introtask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionTests {

    @Test
    public void subtractionCorrectData() {
        Fraction actual =
                new Fraction(4, 5).subtraction(new Fraction(2, 5));

        Fraction expected = new Fraction(2, 5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractionInteger() {
        Fraction actual =
                new Fraction(5).subtraction(new Fraction(3));

        Fraction expected = new Fraction(2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractionNull() {
        Fraction fraction0 = new Fraction(3, 7);
        Fraction fraction1 = new Fraction(0);

        Fraction actual = fraction0.subtraction(fraction1);

        Assert.assertEquals(fraction0, actual);
    }

    @Test
    public void subtractionEdgeValues() {
        Fraction fraction0 = new Fraction(-1);
        Fraction fraction1 = new Fraction(1);

        Assert.assertEquals(new Fraction(2), fraction1.subtraction(fraction0));
        Assert.assertEquals(new Fraction(-2), fraction0.subtraction(fraction1));
    }
}
