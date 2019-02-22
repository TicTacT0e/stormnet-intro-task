package introtask.linkedlist;

import introtask.Fraction;
import introtask.MyLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class EqualsTests {

    @Test
    public void equalsEmptyList() {
        Assert.assertTrue(
                new MyLinkedList<Integer>().equals(new MyLinkedList<Integer>())
        );
    }

    @Test
    public void equalsSameList() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(1);

        Assert.assertTrue(list.equals(list));
    }

    @Test
    public void equalsLists() {
        MyLinkedList<Integer> list0 = new MyLinkedList<>();
        list0.add(0);
        list0.add(1);
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.add(0);

        Assert.assertFalse(list0.equals(list1));
    }

    @Test
    public void equalsAfterGet() {
        MyLinkedList<Integer> list0 = new MyLinkedList<>();
        list0.add(0);
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.add(0);

        list0.get(0);

        Assert.assertTrue(list0.equals(list1));
    }

    @Test
    public void equalsAfterRemove() {
        MyLinkedList<Integer> list0 = new MyLinkedList<>();
        list0.add(0);
        list0.add(1);
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.add(0);

        list0.remove(1);

        Assert.assertTrue(list0.equals(list1));
    }

    @Test
    public void equalsAdditivity() {
        MyLinkedList<Integer> list0 = new MyLinkedList<>();
        list0.add(3);
        MyLinkedList<Integer> list1 = new MyLinkedList<>();
        list1.add(3);

        Assert.assertEquals(
                list0.equals(list1), list1.equals(list0)
        );
    }

    @Test
    public void equalsListWithDifferentTypes() {
        MyLinkedList<Fraction> list0 = new MyLinkedList<>();
        MyLinkedList<Integer> list1 = new MyLinkedList<>();

        list0.add(new Fraction(1, 2));
        list1.add(1);

        Assert.assertFalse(list0.equals(list1));
    }

    @Test
    public void equalsNull() {
        Assert.assertFalse(new MyLinkedList<Integer>().equals(null));
    }

    @Test
    public void equalsDifferentObject() {
        Assert.assertFalse(
                new MyLinkedList<Fraction>().equals(new Fraction(1))
        );
    }
}
