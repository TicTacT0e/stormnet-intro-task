package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class HashCodeMethodTest {

    @Test
    public void hashCodeAdditivityTest() {
        Assert.assertEquals(new Fraction(2).hashCode(),
                new Fraction(2).hashCode());
    }
}
