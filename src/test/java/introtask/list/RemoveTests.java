package introtask.list;

import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class RemoveTests {

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenListIsEmpty() {
        MyList<Integer> list = new MyList<>();

        list.remove(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenIndexBiggerThanSize() {
        MyList<Integer> list = new MyList<>();

        list.add(0);
        list.remove(16);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenIndexLessThanZero() {
        MyList<Integer> list = new MyList<>();

        list.add(0);
        list.remove(-4);
    }

    @Test
    public void remove() {
        MyList<Integer> list = new MyList<>();
        Integer item = 11;
        list.add(item);

        Assert.assertEquals(item, list.remove(0));

        for (int i = 0; i < 5; i++) {
            list.add(i);
        }

        list.remove(0);
    }
    
}
