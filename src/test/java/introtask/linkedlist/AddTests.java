package introtask.linkedlist;

import introtask.Fraction;
import introtask.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class AddTests {

    @Test
    public void add() {
        MyLinkedList<Fraction> list = new MyLinkedList<>();
        list.add(new Fraction(1, 2), 0);
        list.add(new Fraction(1, 3), 0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addWithIndexBiggerThanSize() {
        MyLinkedList<Fraction> list = new MyLinkedList<>();

        list.add(new Fraction(1, 2), 55);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void addWithIndexLessThanZero() {
        MyLinkedList<Fraction> list = new MyLinkedList<>();

        list.add(new Fraction(1, 2), -2);
    }

    @Test
    public void addWithIndex() {
        MyLinkedList<Fraction> list = new MyLinkedList<>();
        Fraction specialFraction = new Fraction(1);
        int indexOfSpecialFraction = 4;
        int quantityOfItems = 6;

        for (int i = 0; i < quantityOfItems; i++) {
            list.add(new Fraction(i + 1, (i + 1) * 3));
        }
        list.add(specialFraction, indexOfSpecialFraction);

        Assert.assertEquals(specialFraction, list.get(indexOfSpecialFraction));
    }
}
