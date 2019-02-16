package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class HashCodeTests {

    @Test
    public void hashCodeAdditivity() {
        Assert.assertEquals(new Fraction(2).hashCode(),
                new Fraction(2).hashCode());
    }
}
