package introTask;

import org.junit.Assert;
import org.junit.Test;

public class EqualsMethodTests {

    @Test
    public void equalsCorrectTest() {
        Assert.assertTrue(new Fraction(1, 2).equals(new Fraction(1, 2)));
        Assert.assertTrue(new Fraction(6).equals(new Fraction(6)));
    }

    @Test
    public void equalsIncorrectTest() {
        Assert.assertFalse(new Fraction(1, 6).equals(new Fraction(-1, 6)));
        Assert.assertFalse(new Fraction(5, 9).equals(new Fraction(3, 4)));
    }

    @Test(expected = ArithmeticException.class)
    public void equalsInvalidDataTest() {
        System.out.println(new Fraction(4, 0).equals(new Fraction(3, -1)));
    }

    @Test
    public void equalsDifferentObjectTest() {
        Assert.assertFalse(new Fraction(1, 2).equals(new StringBuilder("some-string")));
    }

    @Test
    public void equalsNullTest() {
        Assert.assertFalse(new Fraction(4, 5).equals(null));
    }

    @Test
    public void equalsAdditivityTest(){
        Fraction fraction0 = new Fraction(1);
        Fraction fraction1 = new Fraction(1);

        Assert.assertTrue(fraction0.equals(fraction1) && fraction1.equals(fraction0));
    }
}
