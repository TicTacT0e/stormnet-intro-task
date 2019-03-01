package introtask.list;

import introtask.Fraction;
import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class AddTests {

    @Test
    public void add() {
        MyList<Fraction> list = new MyList<>();
        list.add(new Fraction(1, 2), 0);
        list.add(new Fraction(1, 3), 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addWithIndexBiggerThanSize() {
        MyList<Fraction> list = new MyList<>();

        list.add(new Fraction(1, 2), 55);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addWithIndexLessThanZero() {
        MyList<Fraction> list = new MyList<>();

        list.add(new Fraction(1, 2), -2);
    }

    @Test
    public void addWithIndex() {
        MyList<Fraction> list = new MyList<>();
        Fraction specialFraction = new Fraction(1);
        int indexOfSpecialFraction = 4;
        int quantityOfItems = 6;

        for (int i = 0; i < quantityOfItems; i++) {
            list.add(new Fraction(i + 1, (i + 1) * 3));
        }
        list.add(specialFraction, indexOfSpecialFraction);

        Assert.assertEquals(specialFraction,
                list.get(indexOfSpecialFraction));
    }

    @Test
    public void addWithIndexEdgeValue() {
        MyList<Fraction> list = new MyList<>();

        list.add(new Fraction(1), 0);
        list.add(new Fraction(1), list.size());
    }
}
