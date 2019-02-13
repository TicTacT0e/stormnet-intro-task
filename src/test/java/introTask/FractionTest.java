package introTask;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FractionTest {

    private Fraction fraction1 = new Fraction(4, 6);
    private Fraction fraction2 = new Fraction(-3, 4);
    private Fraction fraction3 = new Fraction(65);
    private Fraction fraction4 = new Fraction(34, 23);


    @Test
    public void multiplication() {

        List<Fraction> actual = new ArrayList<>();
        actual.add(fraction1.multiplication(fraction2));
        actual.add(fraction2.multiplication(fraction3));
        actual.add(fraction2.multiplication(fraction2));
        actual.add(fraction4.multiplication(fraction1));

        List<Fraction> expected = new ArrayList<>();
        expected.add(new Fraction(-1, 2));
        expected.add(new Fraction(-195, 4));
        expected.add(new Fraction(9, 16));
        expected.add(new Fraction(68, 69));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addCorrect() {

        List<Fraction> actual = new ArrayList<>();
        actual.add(fraction1.add(fraction3));
        actual.add(fraction2.add(fraction4));
        actual.add(fraction3.add(fraction3));
        actual.add(fraction4.add(fraction1));

        List<Fraction> expected = new ArrayList<>();
        expected.add(new Fraction(197, 3));
        expected.add(new Fraction(67, 92));
        expected.add(new Fraction(130));
        expected.add(new Fraction(148, 69));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addWrong() {

        Fraction fract1 = new Fraction(1, 0);
        Fraction fract2 = new Fraction(2, -1);

        fract1.add(fract2);
    }

    @Test
    public void addLimit() {

        Fraction limitFract = new Fraction(999999999);

        limitFract.add(limitFract);

    }

    @Test
    public void division() {

        List<Fraction> actual = new ArrayList<>();
        actual.add(fraction1.division(fraction3));
        actual.add(fraction2.division(fraction1));
        actual.add(fraction3.division(fraction4));
        actual.add(fraction4.division(fraction4));
        actual.add(fraction1.division(fraction2));

        List<Fraction> expected = new ArrayList<>();
        expected.add(new Fraction(2, 195));
        expected.add(new Fraction(-9, 8));
        expected.add(new Fraction(1495, 34));
        expected.add(new Fraction(1));
        expected.add(new Fraction(-8, 9));

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void subtraction() {

        List<Fraction> actual = new ArrayList<>();
        actual.add(fraction1.subtraction(fraction2));
        actual.add(fraction2.subtraction(fraction4));
        actual.add(fraction3.subtraction(fraction1));
        actual.add(fraction4.subtraction(fraction4));

        List<Fraction> expected = new ArrayList<>();
        expected.add(new Fraction(17, 12));
        expected.add(new Fraction(-205, 92));
        expected.add(new Fraction(193, 3));
        expected.add(new Fraction(0));

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void equals() {
        List<Boolean> actual = new ArrayList<>();
        actual.add(fraction1.equals(fraction1));
        actual.add(fraction3.equals(fraction4));

        List<Boolean> expected = new ArrayList<>();
        expected.add(Boolean.FALSE);
        expected.add(Boolean.TRUE);
    }



}