package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class MultiplicationMethodTests {

    @Test
    public void multiplicationCorrectDataTest() {
        Fraction actual =
                new Fraction(2, 3).multiplication(new Fraction(1, 4));

        Fraction expected = new Fraction(1, 6);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationIntegerTest() {
        Fraction actual =
                new Fraction(5).multiplication(new Fraction(4));

        Fraction expected = new Fraction(20);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationNullTest() {
        Fraction actual =
                new Fraction(5, 8).multiplication(new Fraction(0));

        Fraction expected = new Fraction(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationAdditivityTest() {
        Fraction fraction0 = new Fraction(5, 7);
        Fraction fraction1 = new Fraction(8, 9);

        Fraction actualFirst = fraction0.multiplication(fraction1);
        Fraction actualSecond = fraction1.multiplication(fraction0);

        Assert.assertEquals(actualFirst, actualSecond);
    }

    @Test
    public void multiplicationEdgeValuesTest() {
        Fraction fraction0 = new Fraction(-1);
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(0);

        Assert.assertEquals(fraction2, fraction1.multiplication(fraction2));
        Assert.assertEquals(fraction0, fraction1.multiplication(fraction0));
    }
}
