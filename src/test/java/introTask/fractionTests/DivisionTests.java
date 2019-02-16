package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class DivisionTests {

    @Test
    public void divisionCorrectDataTest() {
        Fraction actual =
                new Fraction(2, 3).division(new Fraction(-7, 9));

        Fraction expected = new Fraction(-18, 21);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionIncorrectDataTest() {
        new Fraction(9, -6);
    }

    @Test
    public void divisionIntegerTest() {
        Fraction actual =
                new Fraction(9).division(new Fraction(8));

        Fraction expected = new Fraction(9, 8);

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ArithmeticException.class)
    public void divisionNullTest() {
        Fraction fraction0 = new Fraction(1, 5);
        Fraction fraction1 = new Fraction(0);

        fraction0.division(fraction1);
    }

    @Test
    public void divisionEdgeValuesTest() {
        Fraction fraction0 = new Fraction(-1);
        Fraction fraction1 = new Fraction(1);
        Fraction fraction2 = new Fraction(0);

        Assert.assertEquals(fraction0, fraction1.division(fraction0));
        Assert.assertEquals(fraction2, fraction2.division(fraction1));
        Assert.assertEquals(fraction0, fraction0.division(fraction1));
        Assert.assertEquals(fraction1, fraction0.division(fraction0));
    }
}
