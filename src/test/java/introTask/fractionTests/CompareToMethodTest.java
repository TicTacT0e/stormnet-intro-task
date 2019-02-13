package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class CompareToMethodTest {

    @Test
    public void compareToCorrectEqualFractionsTest() {
        Assert.assertEquals(0,
                new Fraction(1, 2).compareTo(new Fraction(2, 4)));
        Assert.assertEquals(0,
                new Fraction(3, 4).compareTo(new Fraction(3, 4)));
        Assert.assertEquals(0,
                new Fraction(8, 9).compareTo(new Fraction(24, 27)));
    }

    @Test
    public void compareToCorrectTest() {
        Assert.assertEquals(-1,
                new Fraction(2, 5).compareTo(new Fraction(4, 5)));
        Assert.assertEquals(-1,
                new Fraction(-1, 7).compareTo(new Fraction(45, 1000)));
        Assert.assertEquals(-1,
                new Fraction(-1, 2).compareTo(new Fraction(-1, 3)));

        Assert.assertEquals(1,
                new Fraction(4, 6).compareTo(new Fraction(3, 6)));
        Assert.assertEquals(1,
                new Fraction(-4, 9).compareTo(new Fraction(-7, 9)));
        Assert.assertEquals(1,
                new Fraction(0).compareTo(new Fraction(-5)));
    }

}
