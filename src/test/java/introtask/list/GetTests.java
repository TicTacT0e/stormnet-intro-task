package introtask.list;

import introtask.MyList;
import org.junit.Assert;
import org.junit.Test;

public class GetTests {

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWhenListIsEmpty() {
        MyList<Integer> list = new MyList<>();
        list.get(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithIndexBiggerThanSize() {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.get(4);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getWithIndexLessThanZero() {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.get(-1);
    }

    @Test
    public void get() {
        MyList<Integer> list = new MyList<>();
        Integer item = 11;
        list.add(item);

        Assert.assertTrue(item.equals(list.get(0)));
    }

    @Test
    public void getWithIndexEdgeValue() {
        int item = 1;
        MyList<Integer> list = new MyList<>();
        list.add(item);

        Assert.assertTrue(item
                == list.get(0));
        Assert.assertTrue(item
                == list.get(list.size() - 1));
    }

}
