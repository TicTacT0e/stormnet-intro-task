package introtask.fractionTests;

import introtask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class ToStringTests {

    @Test
    public void toStringInteger() {
        Fraction fraction = new Fraction(1);
        Assert.assertEquals("1", fraction.toString());
    }

    @Test
    public void toStringFraction() {
        Fraction fraction = new Fraction(-1, 2);
        Assert.assertEquals("-1/2", fraction.toString());
        System.out.println(fraction.toString());
    }
}
