package introtask.fraction;

import introtask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class EqualsTests {

    @Test
    public void equalsTrue() {
        Assert.assertTrue(new Fraction(1, 2)
                .equals(new Fraction(1, 2)));
        Assert.assertTrue(new Fraction(6)
                .equals(new Fraction(6)));
        Fraction fraction = new Fraction(9, 17);
        Assert.assertTrue(fraction.equals(fraction));
    }

    @Test
    public void equalsFalse() {
        Assert.assertFalse(new Fraction(1, 6)
                .equals(new Fraction(-1, 6)));
        Assert.assertFalse(new Fraction(5, 9)
                .equals(new Fraction(3, 4)));
        Assert.assertFalse(new Fraction(1, 2)
                .equals(new Fraction(1, 3)));
        Assert.assertFalse(new Fraction(1, 3)
                .equals(new Fraction(2, 3)));
    }

    @Test
    public void equalsDifferentObject() {
        Assert.assertFalse(new Fraction(1, 2)
                .equals(new StringBuilder("some-string")));
    }

    @Test
    public void equalsNull() {
        Assert.assertFalse(new Fraction(4, 5)
                .equals(null));
    }

    @Test
    public void equalsAdditivity() {
        Fraction fraction0 = new Fraction(1, 3);
        Fraction fraction1 = new Fraction(1, 3);

        Assert.assertTrue(fraction0.equals(fraction1)
                && fraction1.equals(fraction0));
    }
}
