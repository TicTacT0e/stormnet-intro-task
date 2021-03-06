package introtask.fraction;

import introtask.Fraction;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Field;

public class ConstructorTests {

    @Test
    public void constructorField() throws NoSuchFieldException, IllegalAccessException {
        int numerator = 3; int denominator = 5;
        Fraction fraction = new Fraction(numerator, denominator);

        Field numeratorField = Fraction.class.getDeclaredField("numerator");
        Field denominatorField = Fraction.class.getDeclaredField("denominator");
        numeratorField.setAccessible(true);
        denominatorField.setAccessible(true);

        int numeratorValue = (Integer) numeratorField.get(fraction);
        int denominatorValue = (Integer) denominatorField.get(fraction);

        Assert.assertTrue(numeratorValue == numerator);
        Assert.assertTrue(denominatorValue == denominator);
    }

    @Test
    public void constructorSimplify() {
        Fraction actual = new Fraction(3, 6);
        Fraction expected = new Fraction(1,2);

        Assert.assertTrue(expected.getNumerator()
                == actual.getNumerator());
        Assert.assertTrue(expected.getDenominator()
                == actual.getDenominator());
    }

    @Test(expected = ArithmeticException.class)
    public void constructorIncorrectData() {
        new Fraction(1, 0);
    }
}