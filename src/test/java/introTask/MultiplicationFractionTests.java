package introTask;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicationFractionTests {

    @Test
    public void multiplicationCorrectTest() {
        Fraction fraction0 = new Fraction(2, 3);
        Fraction fraction1 = new Fraction(1, 4);

        Fraction actual = fraction0.multiplication(fraction1);

        Fraction expected = new Fraction(1, 6);

        Assert.assertEquals(expected, actual);

        fraction0 = new Fraction(-4, 5);
        fraction1 = new Fraction(2, 9);

        actual = fraction0.multiplication(fraction1);

        expected = new Fraction(-8, 45);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void multiplicationIncorrectTest() {
        Fraction fraction0 = new Fraction(4, 0);
        Fraction fraction1 = new Fraction(7, 2);

        fraction0.multiplication(fraction1);

        fraction0 = new Fraction(3, 8);
        fraction1 = new Fraction(9, -4);

        fraction0.multiplication(fraction1);
    }

    @Test
    public void multiplicationIntegerTest() {
        Fraction fraction0 = new Fraction(5);
        Fraction fraction1 = new Fraction(4);

        Fraction actual = fraction0.multiplication(fraction1);

        Fraction expected = new Fraction(20);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationNullTest() {
        Fraction fraction0 = new Fraction(5, 8);
        Fraction fraction1 = new Fraction(0);

        Fraction actual = fraction0.multiplication(fraction1);

        Fraction expected = new Fraction(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void multiplicationAdditivityTest() {
        Fraction fraction0 = new Fraction(5, 7);
        Fraction fraction1 = new Fraction(8, 9);

        Fraction actual0 = fraction0.multiplication(fraction1);
        Fraction actual1 = fraction1.multiplication(fraction0);

        Assert.assertEquals(actual0, actual1);

        fraction0 = new Fraction(-8, 29);
        fraction1 = new Fraction(9, 34);

        actual0 = fraction0.multiplication(fraction1);
        actual1 = fraction1.multiplication(fraction0);

        Assert.assertEquals(actual0, actual1);
    }

    @Test
    public void multiplicationLimitTest() {
        // 2 147 483 647
        Fraction fraction0 = new Fraction(2100000000);
        Fraction fraction1 = new Fraction(2000000000);

        Fraction actual = fraction0.multiplication(fraction1);

        System.out.println(actual.getNumerator() + " / " + actual.getDenominator());
    }
}
