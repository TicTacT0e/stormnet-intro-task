package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class DivisionMethodTests {

    @Test
    public void divisionCorrectTest() {
        Fraction fraction0 = new Fraction(2, 3);
        Fraction fraction1 = new Fraction(-7, 9);

        Fraction actual = fraction0.division(fraction1);

        Fraction expected = new Fraction(-18, 21);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionIncorrectTest() {
        new Fraction(9, -6);
    }

    @Test
    public void divisionIntegerTest() {
        Fraction fraction0 = new Fraction(9);
        Fraction fraction1 = new Fraction(8);

        Fraction actual = fraction0.division(fraction1);

        Fraction expected = new Fraction(9, 8);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionNullTest() {
        Fraction fraction0 = new Fraction(1, 5);
        Fraction fraction1 = new Fraction(0);

        fraction0.division(fraction1);
    }
}
