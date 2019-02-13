package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class SubtractionMethodTests {

    @Test
    public void subtractionCorrectTest() {
        Fraction fraction0 = new Fraction(4, 5);
        Fraction fraction1 = new Fraction(2, 5);

        Fraction actual = fraction0.subtraction(fraction1);

        Fraction expected = new Fraction(2, 5);

        Assert.assertEquals(expected, actual);

        fraction0 = new Fraction(-1, 4);
        fraction1 = new Fraction(5, 8);

        actual = fraction0.subtraction(fraction1);

        expected = new Fraction(-7, 8);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void subtractionIncorrectTest() {
        Fraction fraction0 = new Fraction(4, -9);
        Fraction fraction1 = new Fraction(1, 2);

        fraction0.subtraction(fraction1);

        fraction0 = new Fraction(7, 9);
        fraction1 = new Fraction(9, 0);

        fraction0.subtraction(fraction1);
    }

    @Test
    public void subtractionIntegerTest() {
        Fraction fraction0 = new Fraction(5);
        Fraction fraction1 = new Fraction(3);

        Fraction actual = fraction0.subtraction(fraction1);

        Fraction expected = new Fraction(2);

        Assert.assertEquals(expected, actual);

        fraction0 = new Fraction(-3);
        fraction1 = new Fraction(-2);

        actual = fraction0.subtraction(fraction1);

        expected = new Fraction(-1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void subtractionNullTest() {
        Fraction fraction0 = new Fraction(1);
        Fraction fraction1 = new Fraction(0);

        Fraction actual = fraction0.subtraction(fraction1);

        Assert.assertEquals(fraction0, actual);

        fraction0 = new Fraction(-4);

        actual = fraction0.subtraction(fraction1);

        Assert.assertEquals(fraction0, actual);
    }
}
