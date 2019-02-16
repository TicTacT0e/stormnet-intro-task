package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class ToStringMethodTests {

    @Test
    public void toStringIntegerTest() {
        Fraction fraction = new Fraction(1);
        Assert.assertEquals("1", fraction.toString());
    }

    @Test
    public void toStringFractionTest() {
        Fraction fraction = new Fraction(-1, 2);
        Assert.assertEquals("-1/2", fraction.toString());
    }
}
