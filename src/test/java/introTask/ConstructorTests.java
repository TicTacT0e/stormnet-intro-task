package introTask;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ConstructorTests {

    @Test
    public void constructorFieldTest() throws NoSuchFieldException, IllegalAccessException {
        int numerator = 3; int denominator = 5;
        Fraction fraction = new Fraction(numerator, denominator);

        Field numeratorField = Fraction.class.getDeclaredField("numerator");
        Field denominatorField = Fraction.class.getDeclaredField("denominator");
        numeratorField.setAccessible(true);
        denominatorField.setAccessible(true);

        int numeratorValue = (Integer) numeratorField.get(fraction);
        int denominatorValue = (Integer) denominatorField.get(fraction);

        Assert.assertEquals(numeratorValue, numerator);
        Assert.assertEquals(denominatorValue, denominator);
    }

    @Test
    public void constructorSimplifyTest() {
        Fraction actualFraction = new Fraction(3, 6);
        Fraction expectedFraction = new Fraction(1,2);

        Assert.assertEquals(expectedFraction, actualFraction);
    }

    @Test(expected = ArithmeticException.class)
    public void constructorArithmeticExceptionTest() {
        Fraction fraction0 = new Fraction(1, 0);
        Fraction fraction1 = new Fraction(2, -1);
    }
}