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
        int size = 10;
        int indexOfRemovedItem = 4;
        int item = 4;
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        int removedItem = list.remove(indexOfRemovedItem);

        Assert.assertTrue(item == removedItem);
    }

    @Test
    public void removeWithIndexEdgeValue() {
        MyList<Integer> list = new MyList<>();
        Integer item = 1;
        list.add(item);

        Assert.assertTrue(item.equals(list.remove(0)));

        list.add(item);

        Assert.assertTrue(item
                .equals(list.remove(list.size() - 1)));
    }

}
