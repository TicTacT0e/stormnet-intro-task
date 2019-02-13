package introTask.fractionTests;

import introTask.Fraction;
import org.junit.Assert;
import org.junit.Test;

public class HashCodeMethodTest {

    @Test
    public void hashCodeAdditivityTest() {
        Fraction fraction0 = new Fraction(2);
        Fraction fraction1 = new Fraction(2);

        Assert.assertEquals(fraction0.hashCode(), fraction1.hashCode());

        fraction0 = new Fraction(-56, 784);
        fraction1 = new Fraction(-56, 784);

        Assert.assertEquals(fraction0.hashCode(), fraction1.hashCode());
    }
}
