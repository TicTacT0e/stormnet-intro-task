package introtask.fraction;

import introtask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class CompareToTests {

    @Test
    public void compareToCorrectEqualFractions() {
        Assert.assertTrue(0 ==
                new Fraction(1, 2).compareTo(new Fraction(2, 4)));
        Assert.assertTrue(0 ==
                new Fraction(3, 4).compareTo(new Fraction(3, 4)));
        Assert.assertTrue(0 ==
                new Fraction(8, 9).compareTo(new Fraction(24, 27)));
    }

    @Test
    public void compareToCorrectLess() {
        Assert.assertTrue(-1 ==
                new Fraction(2, 5).compareTo(new Fraction(4, 5)));
        Assert.assertTrue(-1 ==
                new Fraction(-1, 7).compareTo(new Fraction(45, 1000)));
        Assert.assertTrue(-1 ==
                new Fraction(-1, 2).compareTo(new Fraction(-1, 3)));
    }

    @Test
    public void compareToCorrectLarger() {
        Assert.assertTrue(1 ==
                new Fraction(4, 6).compareTo(new Fraction(3, 6)));
        Assert.assertTrue( 1 ==
                new Fraction(-4, 9).compareTo(new Fraction(-7, 9)));
        Assert.assertTrue(1 ==
                new Fraction(0).compareTo(new Fraction(-5)));
    }
}
