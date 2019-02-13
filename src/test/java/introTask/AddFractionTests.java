package introTask;

import org.junit.Assert;
import org.junit.Test;

public class AddFractionTests {

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
        expectedFraction = new Fraction(-3,2);

        Assert.assertEquals(expectedFraction, actualFraction);
    }
}
