package introtask.fraction;

import introtask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class HashCodeTests {

    @Test
    public void hashCodeAdditivity() {
        Assert.assertTrue(new Fraction(2).hashCode() ==
                new Fraction(2).hashCode());
    }
}
