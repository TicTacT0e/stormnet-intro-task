package introtask.list;

import introtask.Fraction;
import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class EqualsTests {

    @Test
    public void equalsEmptyList() {
        Assert.assertTrue(
                new MyList<Integer>().equals(new MyList<Integer>())
        );
    }

    @Test
    public void equalsSameList() {
        MyList<Integer> list = new MyList<>();
        list.add(1);

        Assert.assertTrue(list.equals(list));
    }

    @Test
    public void equalsLists() {
        MyList<Integer> list0 = new MyList<>();
        list0.add(0);
        list0.add(1);
        MyList<Integer> list1 = new MyList<>();
        list1.add(0);

        Assert.assertFalse(list0.equals(list1));
    }

    @Test
    public void equalsAfterGet() {
        MyList<Integer> list0 = new MyList<>();
        list0.add(0);
        MyList<Integer> list1 = new MyList<>();
        list1.add(0);

        list0.get(0);

        Assert.assertTrue(list0.equals(list1));
    }

    @Test
    public void equalsAfterRemove() {
        MyList<Integer> list0 = new MyList<>();
        list0.add(0);
        list0.add(1);
        MyList<Integer> list1 = new MyList<>();
        list1.add(0);

        list0.remove(1);

        Assert.assertTrue(list0.equals(list1));
    }

    @Test
    public void equalsAdditivity() {
        MyList<Integer> list0 = new MyList<>();
        list0.add(3);
        MyList<Integer> list1 = new MyList<>();
        list1.add(3);

        Assert.assertEquals(
                list0.equals(list1), list1.equals(list0)
        );
    }

    @Test
    public void equalsListWithDifferentTypes() {
        MyList<Fraction> list0 = new MyList<>();
        MyList<Integer> list1 = new MyList<>();

        list0.add(new Fraction(1, 2));
        list1.add(1);

        Assert.assertFalse(list0.equals(list1));
    }

    @Test
    public void equalsNull() {
        Assert.assertFalse(new MyList<Integer>().equals(null));
    }

    @Test
    public void equalsDifferentObject() {
        Assert.assertFalse(
                new MyList<Fraction>()
                        .equals(new Fraction(1))
        );
    }
}
